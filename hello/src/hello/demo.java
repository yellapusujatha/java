package hello;

import java.util.Scanner;

class demo
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter marks");
		int marks=scan.nextInt();
		if(marks<50)
		{
			System.out.println("D-grade");
		}
		else if(marks>=50&& marks<60)
		{
			System.out.println("c-grade");
		}
		else if(marks>=60&& marks<70)
		{
			System.out.println("B-grade");
		}
		else if(marks>=70&& marks<80)
		{
			System.out.println("A-grade");
		}
		else
			System.out.println("A++-grade");
	}
}
			
		
