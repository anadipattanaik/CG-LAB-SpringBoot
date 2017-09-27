package com.anadi.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String name;
	private int age;
	private Department dept;
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
