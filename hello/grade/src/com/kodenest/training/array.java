package com.kodenest.training;
import java.util.*;
public class array {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float [][]arr=new float[4][3];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the height os the players"+i+"plays"+j);
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("array contents....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
			}
				
			
		}
		
		
				
			}
		
	
	
	


