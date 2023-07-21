package polygonidentifier;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of sides to identify the shape");
		int sides=scan.nextInt();
		identifyPolygon(sides);

	}

	public static void identifyPolygon(int sides)

	{

	switch(sides)

	{

	case 3: System.out.println("Triangle");

	break;

	case 4: System.out.println("Quadrilateral");

	break;

	case 5: System.out.println("Pentagon");

	break;

	case 6: System.out.println("Hexagon");

	break; // Add more cases as needed

	default: System.out.println("Polygon");

	break;

	}

	}

	
	
		
				
		
	}


