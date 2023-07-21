package conditionalconstructor;
import java.util.*;
class Grade{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter + or - or * or /");
		char opt = scan.next().charAt(0);
		switch(opt)
		{
		case '+':
		System.out.println("addition operator");
		break;
		case '-':
			System.out.println("substraction operator");
			break;
		case '*':
			System.out.println("multiplication operator");
			break;
		case '/':
			System.out.println("division operator");
			break;
			default :
				System.out.println("idiot see the msg carefully");
		}
	

					
					
					
					
		
			
			
		
	
		
		
	}


