package com.employeemanagement;

public class Employee {
private int id;
private String name;
private int age;
private double salary;
public Employee(int id, String name, int age, String department, String designation, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.designation = designation;
	this.department = department;
}
private String designation;
private String department;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", designation="
			+ designation + ", department=" + department + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

}
