package com.tns.thisexample;

public class MethodOverloading {
	/* class having a same named method with different parameter called MethodOveloading 
	 * problems solution- using providing various data type as argument  
	 * using multiple arguments in methods
	 * applying different naming of local variable 
	 * changing of position of parameter */
     int  add(int a, int b) {
    	 return a+b;
     }
	  int add(int b,long y) {
		return (int) (b+y);
		  
	  }
	  int add(long y,int b) {
		  return (int) (b+y);
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ml=new MethodOverloading();
		System.out.println(ml.add(89, 68));
		System.out.println(ml.add(89, (int) 68.9));
		System.out.println(ml.add((int) 68.9, 8));
	}

}
