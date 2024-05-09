package com.shimbhu;

public class Organization {

	private Employee employee;
	
	Organization(Employee emp)
	{
	    this.employee = emp;
	}
	
	Employee getRoot()
	{
		return employee;
	}
}
