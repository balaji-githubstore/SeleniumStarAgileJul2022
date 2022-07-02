package com.staragile.area;

public class Area {

	public double areaOfCircle(int r) {
		double area = 3.14 * r * r;
		return area;
	}

	public static double areaOfRectangle(double length, double width) {
		return length * width;
	}

	public static String getName() {
		String name = "Balaji Dinakaran";
		return name;
	}

	public static void close()
	{
		
	}
	
	public void printClassDescription()
	{
		System.out.println("Area formulae!!!");
	}
}


