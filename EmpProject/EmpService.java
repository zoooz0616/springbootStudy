package com.example.myapp.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpService implements IEmpService {
	@Autowired
	IEmpRepository empRepository;

	@Override
	public int getEmpCount() {
		return empRepository.getEmpcount();
	}

	@Override
	public int getEmpCount(int deptId) {
		return empRepository.getEmpCount(deptId);
	}

	@Override
	public List<EmpVO> getEmpList() {
		return empRepository.getEmpList();
	}
	
	@Override
	public EmpVO getEmpInfo(int empId) {
		return empRepository.getEmpInfo(empId);
	}

	@Override
	public void updateEmp(EmpVO emp) {
		empRepository.updateEmp(emp);
	}

	@Override
	public void insertEmp(EmpVO emp) {
		empRepository.insertEmp(emp);
	}

	@Override
	@Transactional
	public int deleteEmp(int empId, String email) {
		empRepository.deleteJobHistory(empId);
		return empRepository.deleteEmp(empId, email);
	}

	@Override
	public List<Map<String, Object>> getAllDeptId() {
		return empRepository.getAllDeptId();
	}

	@Override
	public List<Map<String, Object>> getAllJobId() {
		return empRepository.getAllJobId();
	}

	@Override
	public List<Map<String, Object>> getAllManagerId() {
		return empRepository.getAllManagerId();
	}

}
