package com.tns.thisexample;

public class ThisExample {
	String a;
	int b;
	long l;

	//this is a keyword 
	//reference variable used to refer the current object
	// this used to invoke instance  variable in 

	public ThisExample(String a,int b,long l) {
		this.a=a;
		this.b=b;
		this.l=l;
		
	}
	
	//used to invoke current class constructor 
	
	public ThisExample() {
		System.out.println("tns free trining ");
	}
	
	public ThisExample(int a) {
		//System.out.println("tns free trining ");
		this();
		System.out.println(a);
		}
	
	//invoke another method inside it
	
	public void newbee() {
		System.out.println("hi bro i am new bee");
		
	}
	
	//reuse of code how by using the calling parent 
   /* lest assume in parent class have some constructor properties you can calling like 
    public ThisExample(){
    this(i,love_my,mom);
    this.a=a;
    }
     */
	
	
	
	
	//used to pass as argument in method
	
	void tns(ThisExample ob) {
		System.out.println("its free");
		
	}
	
	void tns2() {
		tns(this);
	}
	
	public  void display() {
		System.out.println(""+a+""+b+""+l);
		this.newbee();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ThisExample te=new ThisExample("hi", 78, 9000);
        te.display();
        System.out.println();
        te.tns2();
	}

}
