package org.java;

public class ChildConst extends ParentConst {

	
	ChildConst(){
		
		super(10);
		System.out.println("child default constructor");
		
		}

		
	ChildConst(int id){
			
			System.out.println("int para const " +id);
				
		}
	
	public static void main(String[] args) {
		ChildConst c = new ChildConst();
		c.ParentConst();
		ChildConst c1 = new ChildConst(100);
	
	}
		
	
	
	
	}


