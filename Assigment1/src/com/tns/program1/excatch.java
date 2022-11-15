package com.tns.program1;
import java.io.IOException;
public class excatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=10;
     // int h=10;
     
    	 try{
             try {
            	 try {
            		 int arr[]=new int[10];	
                     arr[20]=a/0;
           	         } 
                     catch (NullPointerException ec) 
                      {
      		            System.out.println("divided by zero");
                      }
                 }
    	            catch (ArithmeticException bc) 
                         {
    	            	System.out.println("hiii");
    	                 }
    	 }
	      catch (NullPointerException cc) 
             {
		  System.out.println("divided by zero");
            }
	 
   
	
}
}
