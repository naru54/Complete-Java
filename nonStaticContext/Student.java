package nonStaticContext;

class Student {

    int age = 20; // non-static variable

    void display() { // non-static method
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student s = new Student(); // object created

        s.display(); // Calling non-static method
        System.out.println(s.age); // Accessing non-static variable

       
    }
}