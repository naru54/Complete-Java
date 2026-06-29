package nonStaticContext;

class Student {

    int age = 20; // non-static variable

    static int rollNo = 101; // static variable

    static void show() { // static method
        System.out.println(rollNo);
        // System.out.println(age); // cannot access non-static variable in static method
    }

    void display() { // non-static method
        System.out.println(age);
        System.out.println(rollNo); // static variable can be accessed inside non-static method
        show(); // static method can be called inside non-static method
    }

    public static void main(String[] args) {
        Student s = new Student(); // object created

        s.display(); // Calling non-static method
        System.out.println(s.age); // Accessing non-static variable

       
    }
}