package com.tns.program1;

public  class Child extends Parent{
             int age;
	         String name;

			Child(int age,String name){
            	this.age=age;
            	this.name=name;
            }
	@Override
	
	void career(int sallary) {
		// TODO Auto-generated method stub
		System.out.println("name of the career\t"+name+"\t"+sallary);
	}

	@Override
	void age() {
		// TODO Auto-generated method stub
		System.out.println("I want to coder at the age "+age);
	}

}
