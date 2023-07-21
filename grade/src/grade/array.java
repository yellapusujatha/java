package grade;

public class array {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter Array Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
		arr[i]=scan.nextInt();
		}
		System.out.println("Array Contents Are.... ");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" ");
		}
		
	}
}








	


