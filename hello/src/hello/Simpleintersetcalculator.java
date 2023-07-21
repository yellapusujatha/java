package hello;

public class Simpleintersetcalculator {
	public static double calculateSimpleInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        return interest;
    }

    public static void main(String[] args) {
        double principal = 1000.0;  // Replace with the actual principal amount
        double rate = 5.0;  // Replace with the actual rate of interest
        double time = 2.0;  // Replace with the actual time in years
        
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        double totalAmount = principal + simpleInterest;

        System.out.println("Principal amount: $" + principal);
        System.out.println("Rate of interest: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple interest: $" + simpleInterest);
        System.out.println("Total amount: $" + totalAmount);
    }
}



