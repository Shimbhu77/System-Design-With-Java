package com.singleton;

import java.util.Objects;

public class SingletonDesignPatternWithLazyInitialization {

	private String firstName;
	private String lastName;
	private static SingletonDesignPatternWithLazyInitialization instance;
    private SingletonDesignPatternWithLazyInitialization(String firstName,String lastName)
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    }
    
    public static SingletonDesignPatternWithLazyInitialization getInstance()
    {
    	if(Objects.isNull(instance))
    	{
    		instance = new SingletonDesignPatternWithLazyInitialization("Shimbhu","Kumawat");
    		
    	}
    	
    	return instance;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
