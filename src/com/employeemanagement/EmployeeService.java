package com.employeemanagement;
import java.util.*;
public class EmployeeService {
HashSet<Employee> empset=new HashSet<Employee>();
Employee emp1=new Employee(101,"suraj",21,"IT","Developer",25000);
Employee emp2=new Employee(102,"rohit",20,"BA","Developer",25000);
Employee emp3=new Employee(103,"mohit",29,"Tester","Developer",25000);
Employee emp4=new Employee(104,"sam",27,"Admin","Developer",25000);
Employee emp5=new Employee(105,"maxim",25,"CO","Developer",25000);
Scanner sc=new Scanner(System.in);
int id;
String name;
int age;
String department;
String designation;
double salary;
boolean found =false;
public EmployeeService() {
	empset.add(emp1);
	empset.add(emp2);
	empset.add(emp3);
	empset.add(emp4);
	empset.add(emp5);
}
// view all employee
public void viewAllEmployees() {
	for (Employee emp:empset) {
		System.out.println(emp);
	}
}
//find employee by id
public void employeeById() {
	
	System.out.println("Enter id");
	id=sc.nextInt();
	for(Employee emp:empset) {
		if(emp.getId() == id) {
			System.out.println(emp);
			found=true;
		}
	}
	if(!found) {
		System.out.println("Employee with this id is not present");
	}
	
}
// update employee
public void updateEmployee() {
	System.out.println("Enter id");
	id=sc.nextInt();
	boolean found=false;
	for(Employee emp:empset) {
		if(emp.getId() == id) {
			System.out.println("Enter name :");
			name=sc.next();
			System.out.println("Enter new salary");
			salary=sc.nextDouble();
			emp.setName(name);
			emp.setSalary(salary);
			System.out.println("Update details of employee are :");
			System.out.println(emp);
			found=true;
		}
	}
	if(!found) {
		System.out.println("Employee with this id is not present");
	}else {
		System.out.println("Employee details updated successfully!!");
	}
}
//Delete employee
public void deleteEmployee() {
	System.out.println("Enter Id:");
	id=sc.nextInt();
	boolean found =false;
	Employee empDelete=null;
	for(Employee emp:empset) {
		if(emp.getId() == id) {
			empDelete=emp;
			found =true;
		}
		}
	if(!found) {
		System.out.println("Employee with this id is not present");
	}
	else {
		empset.remove(empDelete);
		System.out.println("Employee deleted successfully!!");
	}
}

//Add employee
public void addEmployee() {
	System.out.println("Enter id:");
	id=sc.nextInt();
	System.out.println("Enter name :");
	name=sc.next();
	System.out.println("Enter age :");
	age=sc.nextInt();
	System.out.println("Enter Designation :");
	designation=sc.next();
	System.out.println("Enter Department :");
	department=sc.next();
	System.out.println("Enter Salary");
	salary=sc.nextDouble();
	Employee emp=new Employee(id,name,age,designation,department,salary);
	empset.add(emp);
	System.out.println(emp);
	System.out.println("Employee added successfully!!");
	
}

}

