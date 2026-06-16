package finalKeywordEx;
public class finalKeyword {
    public static void main(String[] args) {
        final int x = 10; // Declare a final variable
        System.out.println("The value of x is: " + x);

        // Uncommenting the following line will cause a compilation error
        // x = 20; // Error: cannot assign a value to final variable x

    }
}
