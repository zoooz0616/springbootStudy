package com.example.myapp.hr;

import org.springframework.stereotype.Service;

@Service
public class EmpService implements IEmpService{

	@Override
	public int getEmpCount(int deptId) {
		if (deptId == 50) {
			return 5;
		} else {
			return 0;
		}
	}
}
