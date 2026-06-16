package conditionalStatements;
/* 
    introduced in Java 12, enhanced switch statement allows you to use the switch statement as an expression and 
    return a value from it. It also allows you to use multiple labels for a single case and eliminates the need 
    for break statements.
*/

// introducted in java 14 using arrow operator (->) to define the case body, which makes the code more concise and readable.

public class EnhancedSwitch {
    public static void main(String[] args) {

        // example for enhanced switch:
        String day = "MON";
        String result = switch (day) {
            case "MON", "TUE", "WED", "THU", "FRI" -> "Weekday";
            case "SAT", "SUN" -> "Weekend";
            default -> "Invalid day.";
        };
        System.out.println(result);

        // example for enhanced switch with char:
        char grade = 'B';
        String gradeMessage = switch (grade) {
            case 'A' -> "Excellent!";
            case 'B' -> "Well done!";
            case 'C' -> "Good.";
            case 'D' -> "You passed.";
            case 'F' -> "Better try again.";
            default -> "Invalid grade.";
        };
        System.out.println(gradeMessage);

        // another example for enhanced switch with multiple labels:
        int month = 2;
        String monthName = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31 days";
            case 4, 6, 9, 11 -> "30 days";
            case 2 -> "28 or 29 days";
            default -> "Invalid month.";
        };
        System.out.println(monthName);
    }
}
