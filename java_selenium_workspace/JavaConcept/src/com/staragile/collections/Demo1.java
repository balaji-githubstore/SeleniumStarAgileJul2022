package com.staragile.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		
		List<String> colors=new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		
		System.out.println(colors);
		System.out.println(colors.get(1));
		
		colors.remove("blue");
		System.out.println(colors);
		
		colors.remove(0);
		
		System.out.println(colors);
		colors.add("green");
		System.out.println(colors);
		
		colors.remove("green");
		System.out.println(colors);
		
		colors.add(0, "red");
		System.out.println(colors);
	}

}
