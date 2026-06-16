package conditionalStatements;

public class TernaryOperator {
    public static void main(String[] args) {

        //example for ternary operator:
        int number = 10;
        String result = (number > 0) ? "The number is positive." : "The number is not positive.";
        System.out.println(result);

        // example for ternary operator with if-else:
        int age = 20;
        String eligibility = (age >= 18) ? "Eligible to vote." : "Not eligible to vote.";
        System.out.println(eligibility);

        // example for ternary operator:
        int x = 5;
        int y = 10;
        int max = (x > y) ? x : y;
        System.out.println("The maximum number is: " + max);

        // example for ternary operator: with 3 integers
        int a = 10;
        int b = 20; 
        int c = 15;
        int highest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The maximum number is: " + highest);

        // example for nested ternary operator:
        int score = 85;
        String grade = (score >= 90) ? "Grade: A" :
                       (score >= 80) ? "Grade: B" :
                       (score >= 70) ? "Grade: C" :
                       (score >= 60) ? "Grade: D" : "Grade: F";
        System.out.println(grade);
    }
}
