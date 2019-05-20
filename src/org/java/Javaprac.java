package org.java;

public class Javaprac {
	

	Javaprac(){
		
		this(10, 10.08f);
		
		System.out.println("default constructor");
	}

	Javaprac(int id, float f){
		this("Sam");
		
		System.out.println("int para const " +id +" float para const " +f);
	}
	
	Javaprac(String name){
		
		System.out.println("string para const" +name);
	}
	public static void main(String[] args) {
		
		Javaprac j = new Javaprac();
	
}


}