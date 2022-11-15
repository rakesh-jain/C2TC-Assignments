package com.tns.program1;

import java.util.Scanner;

public class PwdException extends Exception {
	 int pwdViolate=0;
	public PwdException( int condition) 
	  {
		  super("Invalid Password!");
		 
	  }
	  public String msg()
	  {
		  switch(pwdViolate) {
		  case 1:return ("Password Should be minimum 6 character");
		  case 2:return("password Should not contain Space");
		  case 3:return("password Should contain Special character");
		  case 4:return("Password Should contain at least 3 upper case letter");
		  case 5:return("Passworfd should contain at least 2 lower case latter");
		  }
		  return ("");
	  }

	  public static void isValid(String pwd)
				 throws PwdException
				 {
					 if(!(pwd.length()<6)) 
					 {
						throw new PwdException(1);
					 }
				    if(pwd.contains("")) 
				    {
				    	throw new PwdException(2);
				    }
				 
				    if(!(pwd.contains("@"))||pwd.contains("#")|| pwd.contains("!")
				    		|| pwd.contains("~")|| pwd.contains("$")|| pwd.contains("%")||
				    		pwd.contains("^")|| pwd.contains("&")|| pwd.contains(")")|| pwd.contains("(")||
				    		pwd.contains("+") ||pwd.contains("@")|| pwd.contains(">")||pwd.contains("<")||
				    		pwd.contains("|")||pwd.contains(";")) 
				    {
				    	throw new PwdException(3);
				    }
				       if (true) 
				       {
				    	   int count=0;
				    	   for (int i=65;i<=90;i++)
				    	   {
				    		   char c=(char)i;
				    		   String s1=Character.toString(c);
				    		   if(pwd.contains(s1)) 
				    		   {
				    		   count=3;
				    	       }
				           }
				    	
				    	if (count==0)
				    	{
				    	   throw new PwdException(4);
				        }
				 }
				 
				        if (true)
				         {
					      int count=0;
					      for (int i=90;i<=122;i++)
			  	           {
			  		       char c=(char)i;
			  		       String s1=Character.toString(c);
			  		       if(pwd.contains(s1)) 
			  		        {
			  		         count=2;
			  	             }
			             }
			  	
			  	    if (count==0)
			  	    {
			  	   throw new PwdException(5);
			        }
			        }
				        
				 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rs=new Scanner(System.in);
		 int uid=rs.nextInt();
		 System.out.println("Enter your uid\n"+uid);
		 String s4=rs.nextLine();
		 System.out.println("Enter your Password");
		 System.out.println(rs.nextLine());
		try
		{
			
			isValid(s4);
		}
		 catch(PwdException e) {
			 System.out.println(e.getMessage());
			 System.out.println(e.msg());
		 }
	}

}
