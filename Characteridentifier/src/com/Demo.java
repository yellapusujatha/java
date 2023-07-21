package com;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age");
		int age=scan.nextInt();
		categorizeAge(age);

	}

	public static void categorizeAge(int age)

	{

	if(age>=0 && age<=12)

	{

	System.out.println("CHILD");

	}

	else if(age>=13 && age<=19)

	{

	System.out.println("TEEN");

	}

	else if(age>=20 && age<=59)

	{

	System.out.println("AFULT");

	}

	else

	{

	System.out.println("SEINOR");

	}

	

	

	
		

			
	
			
			
			
		
			
		


		
	}

}
