package conditionalStatements;

public class IfElseExample {
    public static void main(String[] args) {

        //example for if:
        int number1 = 10;
        if (number1 > 0) {
            System.out.println("The number is positive.");
        }

        //example 1 for if-else:
        int number = -5;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        // example 2 for if-else:
        int age = 20;
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        //example for if-else-if:
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // example for nested if-else:
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a is greater than b.");
        } else {
            if (a < b) {
                System.out.println("a is less than b.");
            } else {
                System.out.println("a is equal to b.");
            }
        }


    }
}
