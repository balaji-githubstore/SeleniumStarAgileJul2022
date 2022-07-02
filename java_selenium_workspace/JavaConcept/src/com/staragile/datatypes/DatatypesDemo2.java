package com.staragile.datatypes;

public class DatatypesDemo2 {
	
	public static void main(String[] args) {
		
				//10,20,30,40,50
		
		int[] numbers=new int[5]; //5*32 bits of memory 
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		//numbers[3]=40;
	//	numbers[4]=50;
		
		System.out.println(numbers);
//		System.out.println(numbers[1000]);
		
		boolean[] arr=new boolean[2];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//red,green,blue
		String[] colors=new String[3];
		colors[0]="red";
		colors[1]="green";
		colors[2]="blue";
		
		//(3+5+4)*16 bits of memory
		
		System.out.println(colors);
		System.out.println(colors[2]);
		
		String[] arrs= {"red","green","blue"};
		
		System.out.println(arrs[2]);
		
	}

}



