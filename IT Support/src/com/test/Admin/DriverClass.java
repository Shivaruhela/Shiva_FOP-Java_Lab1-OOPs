package com.test.Admin;

import java.util.Scanner;

import com.test.Admin.Model.Employee;
import com.test.Admin.Service.CredentialService;

public class DriverClass {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Fname of the employee");
		String fName = scan.next();
		System.out.println("Enter Sname of the employee");
		String sName = scan.next();
		
		Employee emp = new Employee(fName, sName);
		
		System.out.println("Pls choose your department");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int deptId = scan.nextInt();
		
		switch(deptId)
		{
			case 1 : 
				CredentialService.ShowCredentials(emp, "Technical");
				break;
			case 2 : 
				CredentialService.ShowCredentials(emp, "Admin");
				break;
			case 3 : 
				CredentialService.ShowCredentials(emp, "Human Resource");
				break;
			case 4 : 
				CredentialService.ShowCredentials(emp, "Legal");
				break;
			default : 
				System.out.println("Please enter a valid choice");
		}
		
		scan.close();
		
	}
}
