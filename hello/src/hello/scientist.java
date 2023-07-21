package hello;

public class scientist {
	 public static double calculateSurfaceArea(double radius) {
	        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
	        return surfaceArea;
	    }

	    public static void main(String[] args) {
	        double radius = 5.0; 
	        double sphereSurfaceArea = calculateSurfaceArea(radius);
	        System.out.println("The surface area of the sphere is: " + sphereSurfaceArea);
	    }
	}
