package hello;

public class Heightconverte {
	 public static String convertToFeet(int inches) {
	        int feet = inches / 12;  // Calculate the whole number of feet
	        int remainingInches = inches % 12;  // Calculate the remaining inches
	        String result = feet + " ft " + remainingInches + " in";
	        return result;
	    }

	    public static void main(String[] args) {
	        int heightInInches = 68;  // Replace with the actual height in inches
	        String heightInFeet = convertToFeet(heightInInches);
	        System.out.println("Height in feet: " + heightInFeet);
	    }
	}


