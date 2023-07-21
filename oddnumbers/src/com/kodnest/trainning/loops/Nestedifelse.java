package com.kodnest.trainning.loops;

public class Nestedifelse {
	public static void main(String[] args) {
        int age = 18;
        boolean isCitizen = true;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");

            if (isCitizen) {
                System.out.println("You are a citizen.");
            } else {
                System.out.println("You are not a citizen.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}

	

