package loops;
import java.util.Scanner;
public class lopps {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1D length");
		int n=scan.nextInt();
		String arr[][]=new String[n][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter 2nd D length for 1st D "+i);
			int m=scan.nextInt();
			arr[i]=new String[m];
		}
		
		scan.nextLine();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter Name of Bank "+i+" Customer "+j);
				arr[i][j]=scan.nextLine();
			}
		}
		
		System.out.println("Array Contents Are.....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	}
	
	

}
