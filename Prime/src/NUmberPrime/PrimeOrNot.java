package NUmberPrime;

import java.util.Scanner;

public class PrimeOrNot {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int N=scan.nextInt();
			for( int i=1;i<=N;i++)
			{
				if(N%i==0) {
					System.out.println("number is not aprime  number");
					return;
				}
				System.out.println("Number is  prime number");
			}
			
			
			
		}
	}


