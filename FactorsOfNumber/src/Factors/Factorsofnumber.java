package Factors;
import java.util.*;
public class Factorsofnumber {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to find a factors of it");
		int n=scan.nextInt();
		for( int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		

			
		}
		
	}

}
