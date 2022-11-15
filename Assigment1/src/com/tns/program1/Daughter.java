package com.tns.program1;

public class Daughter extends Parent {
	   int age;
       String name;

		Daughter(String name,int age)
		{
       	this.name=name;
       	this.age=age;
        }
	@Override
	void career(int sallary) {
		System.out.println("name of the career\t"+name+"\t"+sallary);
		
	}

	@Override
	void age() {
		System.out.println("I want to coder at the age of"+age);
	
		
	}

}
