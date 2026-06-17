package loops;

public class WhileExample { 
    public static void main(String[] args) {

        // infinite loop 
       /*  while(true) {
            System.out.println("Hello World!");
        } */

     /*   while(false) {
           System.out.println("Hello World!"); // this will give you compile time error because this is unreachable code
       } */

        int i = 0;
        while (i < 5) {
            System.out.println("Hi" + i);
            i++;
        }
    }
}
