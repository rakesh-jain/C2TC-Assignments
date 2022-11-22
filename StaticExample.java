package com.tns.thisexample;

public class StaticExample {
   static String company="TESLA";
   int a;
   int b;
   public StaticExample(int a,int b){
	  this.a=a; 
	  this.b=b;
   }
   void newbee() {
	   System.out.println(b);
	   System.out.println(a);
	   System.out.println(company);
   }
//   execute before main method load the class 
   static{
	  System.out.println("hi iam tns "); 
   }
	
	/*  static is a keyword used in various way here some example
	 * static variable - used to indicate the unique value 
	 * in counter example its get the memory only ones
	 *  without static main method,  it was possible till JDK 1.6. Since JDK 1.7,
	 *   it is not possible to execute a Java class without the main method.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample st=new StaticExample(7,8);
		st.newbee();
	}

}
