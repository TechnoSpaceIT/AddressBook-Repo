package com.infogalaxy.addressbook;

public class Demo {

	int a = 10;				//Class Variable
	
	public void show() {	//Scope
		int b = 20;			//Local Variable
		System.out.println("A="+a);
	}
	
	public void show2() {
		System.out.println("A="+a);
	}
	
	public static void main(String args[]) {
		Demo D = new Demo();		//4 bytes
		D.show();					//8 bytes
		D.show2();					//4 bytes
		
		
	}
	
	
}
