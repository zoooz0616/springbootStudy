package com.example.myapp.jdbc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext context =
				new GenericXmlApplicationContext("application-config.xml");
		IEmpService service=context.getBean(IEmpService.class);
		
		System.out.println("--사원의 수 조회");
		System.out.println("---------------------");
		System.out.println(service.getEmpCount());
		System.out.println("---------------------");
		System.out.println(service.getEmpCount(50));
		
		System.out.println("--103번 사원의 정보 조회");
		System.out.println("---------------------");
		System.out.println(service.getEmpInfo(103));
		
		System.out.println("--사원 전체 정보 조회");
		System.out.println(service.getEmpList());
		
		System.out.println("--새로운 사원 정보 입력");
		EmpVO empVO=new EmpVO();
		empVO.setEmployeeId(210);
		empVO.setFirstName("jinkyoung");
		empVO.setLastName("heo");
		empVO.setEmail("heojk@gmail.com");
		empVO.setPhoneNumber("222-2222");
		empVO.setJobId("IT_PROG");
		empVO.setSalary(8000);
		empVO.setCommissionPct(0.2);
		empVO.setManagerId(100);
		empVO.setDepartmentId(10);
		
		try {
			service.insertEmp(empVO);
			System.out.println("insert ok");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println("--신규 사원의 정보를 조회/출력합니다.");
		EmpVO emp210=service.getEmpInfo(210);
		System.out.println(emp210);
		
		System.out.println("--210번 사원의 급여를 10% 인상시킵니다.");
		emp210.setSalary(emp210.getSalary()*1.1);
		service.updateEmp(emp210);
		
		System.out.println("--수정된 사원의 정보를 조회/출력합니다.");
		emp210=service.getEmpInfo(210);
		System.out.println(emp210);
		context.close();
	}

}
