package com;
import java.util.*;
public class Main {
	public static void CheckMultipleOfTen(int n,int m) {
		if(m%n==0)
		{
			System.out.println("Enter anumber"+n+" is multiple of+m");
		}
		else
		{
			System.out.println("Enter a number "+n+" is not multipe of+m");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 number");
		int n=scan.nextInt();
		int m=scan.nextInt();
		CheckMultipleOfTen(n,m);
			
	}
		
		
		
	}


