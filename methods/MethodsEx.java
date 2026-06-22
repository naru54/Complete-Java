package methods;

class MethodsEx {

    // Example for a Java method : static method
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // non-static method
    public int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        // Calling the static method
        int result = addNumbers(5, 10);
        System.out.println("The sum is: " + result);

        // Creating an object of the class to call the non-static method
        MethodsEx obj = new MethodsEx();    
        int result2 = obj.multiplyNumbers(5, 10);
        System.out.println("The product is: " + result2);
        
    }

}
