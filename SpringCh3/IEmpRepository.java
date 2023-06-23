package com.example.myapp.jdbc;

public interface IEmpRepository {
	int getEmpCount(int deptId);
	int getEmpcount();
	EmpVO getEmpInfo(int empId);
}
