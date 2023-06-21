package com.sample.myapp.member;

public class MemberService implements IMemberService{

	@Override
	public MemberVO getMemberInfo() {
		MemberVO memberVO = new MemberVO();
		memberVO.setMemberId("1234");
		memberVO.setName("이은지");
		memberVO.setAge(25);
		memberVO.setEmail("eunzi@gmaii.com");
		return memberVO;
	}
	
}
