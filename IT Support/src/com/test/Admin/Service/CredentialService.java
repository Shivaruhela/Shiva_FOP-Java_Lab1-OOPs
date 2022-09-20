package com.test.Admin.Service;

import java.util.Random;

import com.test.Admin.Model.Employee;

public class CredentialService {
	public static final int PASSWORD_LENGTH = 8;
	public static char[] generatePasssword()
	{
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String upperCaseLetters = lowerCaseLetters.toUpperCase();
		String numbers = "1234567890";
		String specialChars = "!@#$%^&*_=+-/.?";
		
		String combination = numbers + upperCaseLetters + lowerCaseLetters + specialChars;
			
		Random random = new Random();
		char password[] = new char[PASSWORD_LENGTH];
		
		for(int i=0; i<PASSWORD_LENGTH; i++)
		{
			password[i] = combination.charAt(random.nextInt(combination.length()));
		}
		
		return password;
	}
	
	public static String generateEmailAddress(String fname, String sname, String dept)
	{
		return fname+sname+"@"+dept+".ABC.com";
	}
	
	public static void ShowCredentials(Employee emp, String dept)
	{
		System.out.println("Emp FirstName is : "+ emp.getFirstname());
		System.out.println("Emp LastName is : "+ emp.getLastname());
		System.out.println("Emp EmailID is : "+ generateEmailAddress(emp.getFirstname().toLowerCase(), emp.getLastname().toLowerCase(), dept.toLowerCase()));
		System.out.println("Emp Password is : "+ String.valueOf(generatePasssword()));
	}
}
