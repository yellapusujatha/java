package com;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.println("Enter Grade");
		Scanner scan=new Scanner(System.in);

		int grade=scan.nextInt();

		checkGrade(grade);

		}

		public static void checkGrade(int grade)

		{

		if(grade>50)

		{

		System.out.println("PASS");

		}

		else

		{

		System.out.println("FAIL");

		}

		}

	}
	

		

		
	
			
		
		
		
				
		
	

