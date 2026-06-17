package loops;

public class DoWhile {
    public static void main(String[] args) {

        // example 1:
        do {
            System.out.println("Hi");
        } while (false); // this will print Hello, World! once because do while loop executes the code
                         // block at least once before checking the condition

        /*
          // example 2:
                do {
                System.out.println("Hi");
                } while (true); // this will print Hi infinitely because the condition is always true
         */ 

        int i = 0;
        do {
            System.out.println("Hello, World! " + i);
            i++;
        } while (i < 5);
    }
}
