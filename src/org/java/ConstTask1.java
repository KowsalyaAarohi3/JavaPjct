package org.java;

public class ConstTask1 {
	
	ConstTask1(){
	
		System.out.println("default constructor");
		
	}
	
	
	ConstTask1(int id){
		
		System.out.println("int para constructor " +id);
		
	}
	
	void ConstTask1(){
		
		System.out.println("nothing");
		
	}
	
	public static void main(String[] args) {
		ConstTask1 c = new ConstTask1();
		ConstTask1 c1 = new ConstTask1(10);
		c.ConstTask1();
		
	}

}
