// Create class Employee_Detail with attributes Employee_ID, Name, Designation, and Salary. Write a program to read the detail from user and print it.

import java.util.*;
public class Lab34{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scm = new Scanner(System.in);
		System.out.println("Employee id: ");		
		int eid = sc.nextInt();
		System.out.println("Name: ");
		String name  = scm.nextLine();
		System.out.println("Designation: ");
		String designation = scm.nextLine();
		System.out.println("Salary: ");
		double salary = sc.nextDouble();
		Employee_Detail emp = new Employee_Detail(eid,name,designation,salary);
		emp.print();
	}
}

class Employee_Detail{
	int employee_id;
	String name;
	String designation;
	double salary;
	Employee_Detail(int employee_id,String name,String designation,double salary){
		this.employee_id = employee_id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
    public void print(){
        System.out.println("Employee ID: "+employee_id);
        System.out.println("Name: "+name);
        System.out.println("Designation: "+designation);
        System.out.println("Salary: "+salary);
    }
}