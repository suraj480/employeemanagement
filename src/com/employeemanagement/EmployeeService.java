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
public EmployeeService() {
	empset.add(emp1);
	empset.add(emp2);
	empset.add(emp3);
	empset.add(emp4);
	empset.add(emp5);
}
public void viewAllEmployees() {
	for (Employee emp:empset) {
		System.out.println(emp);
	}
}
}
