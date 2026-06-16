public class thisKeyword {
    int x = 5; // Instance variable

    public void method() {
        int x = 10; // Local variable with the same name as the instance variable
        System.out.println("Local variable x: " + x); // This will print 10
        System.out.println("Instance variable x: " + this.x); // This will print 5
    }

    public static void main(String[] args) {
        thisKeyword obj = new thisKeyword();
        obj.method();
    }

    int a;
    public thisKeyword(int a) {
        this.a = a; // Using 'this' to refer to the instance variable
    }   

    // Constructor overloading: The "this" keyword can also be used to call another constructor in the same class. This is known as constructor overloading.

    public thisKeyword() {
        this(10); // Calling the constructor with an integer parameter and passing a default value of 10
    }

    // return this: The "this" keyword can also be used to return the current instance of the class from a method.
    public thisKeyword getThis() {
        return this; // Returning the current instance of the class
    }


   

}
