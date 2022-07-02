package com.staragile.datatypes;

public class DatatypesDemo1 {
	
	public static void main(String[] args) {
		
		byte a=100; //a will be reserved for byte - 8 bits of memory
		
		short b=100; // 16 bits of memory
		
		int c=100; //32 bits of memory 
		
		long d=7887878745L; //64 bits of memory
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int z=b; //implicit conversion //16 bits to 32 bits 
		
		float e=10.2f; //32 bits of memory
		
		double f=10.2; //64 bits of memory
		
		char letter='f'; //16 bits of memory
		
		boolean check=true;
		
		float x=10.1f;
		
		double y=10.123456789;
		System.out.println(y);
		
		float v=(float) y;  //64 bits to 32 bits //explicit conversion //lead to data loss
		System.out.println(v);
		
		System.out.println((double)22/7);
		
		int base=25;
		int height=1;
		
		double res= (base*height)/2.0;
		
		System.out.println(res);
		
		String myName="balaji"; //16*6 bits of memory
		
		char let= myName.charAt(1);
		System.out.println(let);
	}

}


