package com.staragile.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee.companyName="StarAgile";
		
		Employee emp1=new Employee();
		Employee emp2=new Employee(102,"Peter");
		Employee emp3=new Employee(103);
		
		emp1.empId=101;
		emp1.empName="John";
		emp1.empSalary=5000;

		emp2.empId=102;
		emp2.empName="Peter";
		emp2.empSalary=8000;

		Employee.displayEmployeeRecord(emp1);
		Employee.displayEmployeeRecord(emp2);
		Employee.displayEmployeeRecord(emp3);
		
		emp1.printEmployeeRecord();
		emp2.printEmployeeRecord();
		emp3.printEmployeeRecord();
	}

}

