package com.sample.myapp;

public class EmpDao {
	public EmpVo getData() {
		//sql 구문이 있다고 가정
		EmpVo empVo = new EmpVo();
		empVo.setData("Hello");
		return empVo;
	}
}
