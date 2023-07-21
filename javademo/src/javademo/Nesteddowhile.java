package javademo;

public class Nesteddowhile {
	    public static void main(String[] args) {
	        int i = 1;
	        int j = 1;

	        do {
	            do {
	                System.out.println("i: " + i + ", j: " + j);
	                j++;
	            } while (j <= 3);

	            i++;
	            j = 1;
	        } while (i <= 3);
	    }
	}

