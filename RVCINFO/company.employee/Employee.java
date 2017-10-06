package com.rvc.info.employee;

import com.rvc.info.person.*;

public class Employee extends Person{
	private double salary;
	public Employee(String name,int age,double salary){
		super(name,age);
		this.salary=salary;
		System.out.println("salary ->>>"+salary);
	}
}