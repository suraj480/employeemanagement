package com.employeemanagement;

import java.util.Scanner;

public class Main {
	static boolean ordering =true;
	public static void menu() {
		System.out.println("************Welcome to Employee management System************"
				+ "\n1. Add Employee"
				+ "\n2. View All Employees"
				+ "\n3. Update Employee"
				+ "\n4. Delete Employee"
				+ "\n5. View Employee"
				+ "\n6. Exit");
	}
	
public static void main (String args[]) {
	  Scanner sc = new Scanner(System.in);
	  EmployeeService service =new EmployeeService();
	do {
		menu();
		 System.out.println("==================================");
         System.out.println("Enter the option");
         System.out.println("======================================");
       int option = sc.nextInt();
       
         switch (option) {
         case 1:
        	 System.out.println("Add Employee");
        	 service.addEmployee();
        	 break;
         case 2:
        	 System.out.println("View All Employees");
        	 service.viewAllEmployees();
        	 break;
         case 3:
        	 System.out.println("Update Employee");
        	 service.updateEmployee();
        	 break;
         case 4:
        	 System.out.println("Delete Employee");
        	 service.deleteEmployee();
        	 break;
         case 5:
        	 System.out.println("View Employee");
        	 service.employeeById();
        	 break;
         case 6:
        	 System.out.println("Thank you for using the application!!");
        	 System.out.println(0);
          default:
        	 System.out.println("Please enter a valid choice");
        	 
         }
	}while(ordering);
}
}
