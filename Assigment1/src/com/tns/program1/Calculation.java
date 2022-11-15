package com.tns.program1;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		double res;
	    char op;
		Scanner cal=new Scanner(System.in);
		System.out.println("-------Simple Calculator--------");
		System.out.println("\nEnter the Numbers here\n");
		num1=cal.nextDouble();
		num2=cal.nextDouble();
		System.out.print("\n Choose Operation(+,-,*,/)\n");
	    op=cal.next().charAt(0);
	    switch(op){ 
			case '+': res=num1 + num2;
			           System.out.println(+num1+""+ op +""+num2+"="+res); 
			           break;
			case '-': res=num1-num2;
			           System.out.println(+num1+""+ op +""+num2+"="+res);
			           break;
			case '*': res=num1*num2;
			           System.out.println(+num1+""+ op +""+num2+"="+res);
			          break;
			case '/': res=num1/num2;
			          System.out.println(+num1+""+ op +""+num2+"="+res);
			          break;
			 default:System.out.println("Enter valid input");       
	               }          
	   
}
}
