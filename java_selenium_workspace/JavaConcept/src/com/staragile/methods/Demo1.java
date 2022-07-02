package com.staragile.methods;

import com.staragile.area.Area;

public class Demo1 {
	
	

	public static void main(String[] args) {
		
		Area obj=new Area();
		
		double result=obj.areaOfCircle(10);
		System.out.println(result);
		
		result= obj.areaOfCircle(20);	
		System.out.println(result);
		
		double res=Area.areaOfRectangle(10, 10.2);
		System.out.println(res);
		
		String myName=Area.getName();
		System.out.println(myName);
		
		Area.close();
		
		obj.printClassDescription();
	}
}
