package com.tns.bankApplication;
import java.util.*;

public   class Details extends Hided{
	
	 
	 void menu() {
		 System.out.println("******WELCOME TO OUR BANK SERVICES*******");
		 System.out.println("------------------------------------------");
		 System.out.println("1.Account Create");
		 System.out.println("2.Details");
		 System.out.println("3.Deposite");
		 System.out.println("4.Withdraw");
		 System.out.println("5.Help");
	 }
	 
	public static void main(String []args) {
		 int choice;
		 int acno = 0 ;
		 String gender=null;
		 int adhar_no;
		 int age;
		 String name;
		 String ac_type;
		 long balance;
		 long amt=0;
		 
		    Details ds=new Details();
		
		   SavingsAccount sa=new SavingsAccount();
		   
		   Scanner sc=new Scanner(System.in);		 
            System.out.println("Enter the account number");
           try { 
        	   acno=sc.nextInt();
		   }
		   catch(InputMismatchException e) {
			   System.out.println("input must be Integer!");
			   System.exit(0);
		   }
            System.out.println("Enter your gender");
	        	try{gender=sc.next();}
	       catch(InputMismatchException a) {System.out.println(a); System.exit(0);}
	        System.out.println("Enter your adhar number");
	        try {
	        	adhar_no=sc.nextInt();
	        }catch(InputMismatchException b) {System.out.println("Enter valid number");System.exit(0);}
	        System.out.println("Enter Your Name");
	        name=sc.next();
	        System.out.println("Enter your Age");
	        age=sc.nextInt();
	        
	        System.out.println("Enter Account Type");
	        ac_type=sc.next();
	        System.out.println("Enter you want to deposit initially");
	        balance=sc.nextLong();
	        
	        do {
		    	ds.menu();
		    	System.out.println("Enter your Choice:");
			    choice=sc.nextInt();
	        }while(choice=='\n');
	        
	         switch(choice) { 
	         case 1:System.out.println("Create an Account(please choose below)");
	           int tik=sc.nextInt();
	           switch(tik)
	           {
	            case 1: System.out.println("Enter your adhar number");
		        try {
		        	adhar_no=sc.nextInt();
		        }catch(InputMismatchException b) 
		        {
		        	System.out.println("Enter valid number");
		        	System.exit(0);
		        }
		        System.out.println("Enter Your Name");
		        name=sc.next();
		        System.out.println("Enter your Age");
		        age=sc.nextInt();
		        System.out.println("Enter Account Type");
		        ac_type=sc.next();
		        System.out.println("Enter you want to deposit initially");
		        balance=sc.nextLong();
	                
	           } break;
	    case 2:System.out.println("*********Account details************");
	       System.out.println("Account number:\t"+acno);
	       System.out.println("Name of the Account holder:\t"+name);
	       System.out.println("Gender:\t"+gender);
	       System.out.println("Age:\t"+age);
	       System.out.println("Account Type:"+ac_type);
	       break;
	    case 3:System.out.println("Enter the Depositing Amount");
	           amt=sc.nextLong();
	           balance=amt+balance;
	           System.out.println("Your Account Balance is:"+balance);
	           amt=0;
	           break;
	    case 4:System.out.println("Enter you want to withdraw");
	           amt=sc.nextLong();
	           if(amt>balance) 
	           {
	        	   System.out.println("your account balance less");
	           }
	           else
	           {
	        	   long draw=balance-amt;
	        	   System.out.println("Withdraw amount is"+draw);
	           }
	           break;
	    case 5:System.out.println("Please kindly wait a minute"); 
	           System.out.println("please enter your issues");
	           String issue=sc.next();
	           System.out.println("We are working on it,\n we will clarify with in two days ");
	           sa.menu2();break;
	    }
	        
	}


	void menu2() {
		// TODO Auto-generated method stub
		System.out.println("Thank you");
	}
}

		    	
		    
		    	   
		             
		
		   




	


