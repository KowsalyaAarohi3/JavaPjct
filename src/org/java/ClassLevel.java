package org.java;

public class ClassLevel {
	int j=90;
	
	
	void method() {
		
		int j;
		j=10;
		
		System.out.println(this.j);
	}
	
	public static void main(String[] args) {
		ClassLevel c = new ClassLevel();
		c.method();
		
	}

}
