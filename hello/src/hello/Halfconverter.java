package hello;

public class Halfconverter {
	public static double calculateHalf(double number) {
        double half = number / 2;
        return half;
    }

    public static void main(String[] args) {
        double amount = 100.0;  // Replace with the actual amount
        double halfAmount = calculateHalf(amount);
        System.out.println("Half of the amount: " + halfAmount);
    }
}


