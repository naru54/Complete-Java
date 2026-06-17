package loops;

public class ForLoop {
    public static void main(String[] args) {

        // for loop without condition
        /*
         * for(;;) {
         * System.out.println("Hello, World!"); // this will print Hello, World!
         * infinitely because there is no condition to stop the loop
         * }
         */

        // for loop with condition, without initialization and increment/decrement
        int i = 0;
        for (; i < 5;) {
            System.out.println("Hello, World! " + i);
        }

        // for loop with initialization, condition and increment/decrement
        for (int j = 0; j < 5; j++) {
            System.out.println("Hello, World! " + j);
        }
    }
}
