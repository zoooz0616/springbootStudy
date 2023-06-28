package com.example.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.myapp.jdbc.EmpVO;
import com.example.myapp.jdbc.IEmpService;

@Controller
public class EmpController {

	@Autowired
	IEmpService empService;
	
	@RequestMapping("/hr/count")
	public String empCount(@RequestParam(value="deptid", required = false,defaultValue = "0")
	int deptid, Model model) {
		int result=empService.getEmpCount(); //biz()실
		if (deptid==0) {
			result=empService.getEmpCount();
		}else {
			result=empService.getEmpCount(deptid);
		}
		model.addAttribute("count", result); //결과를 model에 저장.
		return "hr/count";//Web-inf/views/hr/count.jsp파일 실
	}
	
	@RequestMapping(value="/hr/list")
	public String getAllEmps(Model model) {
		List<EmpVO> empList=empService.getEmpList();
		model.addAttribute("empList", empList);
		return "hr/list";
	}
	
	@RequestMapping(value="hr/{employeeId}")
	public String getEmpInfo(@PathVariable int employeeId, Model model) {
		EmpVO emp=empService.getEmpInfo(employeeId);
		model.addAttribute("emp",emp);
		return "hr/view";
	}
}
