package com.singleton;

public class Main {
   
	public static void main(String[] args) {
	   
	   // Singleton Class Object created when the Class is loaded into the main memory
	   // Eager Initialization:
	   for(int i=0;i<3;i++)
	   {
		   SingletonDesignPatternWithEarlyInitialization singleton = SingletonDesignPatternWithEarlyInitialization.getInstance();
		   System.out.println(singleton);
		   System.out.println("Full Name : "+singleton.getFirstName()+" "+singleton.getLastName());
	   }
	   
	   // Lazy Initialization:
	   for(int i=0;i<3;i++)
	   {
		   SingletonDesignPatternWithLazyInitialization singleton = SingletonDesignPatternWithLazyInitialization.getInstance();
		   System.out.println(singleton);
		   System.out.println("Full Name : "+singleton.getFirstName()+" "+singleton.getLastName());
	   }
	   
	}
}
