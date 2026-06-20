package staticContext;

public class Demo {
    int x = 10; // instance or non-static variable

    static void display() {
        // System.out.println(x); // cannot access non-static member from inside static method
        Demo obj = new Demo();
        System.out.println(obj.x);
    }

    public static void main(String[] args) {

        // System.out.println(x); // this will show comile time error saying : Cannot
        // make a static reference to the non-static field x

        // correct way
        Demo obj = new Demo();
        System.out.println(obj.x);

        display();

    }
}