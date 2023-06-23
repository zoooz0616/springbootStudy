package com.example.myapp.jdbc;

public interface IEmpService {
	int getEmpCount();
	int getEmpCount(int deptId);
	EmpVO getEmpInfo(int empId);
}
