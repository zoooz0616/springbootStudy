package com.sample.myapp.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString
public class MemberVO {
	String memberId;
	String name;
	int age;
	String email;
}
