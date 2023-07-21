package loops;

public class simpleif {
	public static void main(String[] args) {
        int num = 25;

        if (num > 0) {
            System.out.println("Number is positive.");

            if (num % 2 == 0) {
                System.out.println("Number is even.");
            } else {
                System.out.println("Number is odd.");
            }
        } else if (num < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }
    }
}

