package com.singleton;

public class SingletonDesignPatternWithEarlyInitialization {
   
	private String firstName;
	private String lastName;
	private static SingletonDesignPatternWithEarlyInitialization instance = new SingletonDesignPatternWithEarlyInitialization("Shimbhu","Kumawat");
	
    private SingletonDesignPatternWithEarlyInitialization(String firstName,String lastName)
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    }
    
    public static SingletonDesignPatternWithEarlyInitialization getInstance()
    {
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
