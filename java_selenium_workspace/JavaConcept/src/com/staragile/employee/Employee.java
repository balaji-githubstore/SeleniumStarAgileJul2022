package com.staragile.employee;

public class Employee {
	public int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	
	public Employee()
	{
		System.out.println("Launch browser");
	}
	
	public Employee(int no)
	{
		empId=no;
		System.out.println("Object created");
	}
	
	public Employee(int no,String name)
	{
		empId=no;
		System.out.println("Object created");
	}
	
	
	public static void displayEmployeeRecord(Employee r)
	{
		
		System.out.println(r.empId);
		System.out.println(r.empName);
		System.out.println(r.empSalary);
		System.out.println(Employee.companyName);
		System.out.println("-----------------------");
	}
	
	public void printEmployeeRecord()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
		System.out.println("-----------------------");
	}
	
//	public static Employee getEmployeeInstance()
//	{
//		Employee e=new Employee();
//		return e;
//	}

}
