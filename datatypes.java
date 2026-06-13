
/* Data Types in Java 
   Datatypes: A data type is a classification that specifies which type of value a variable can hold. 
              In Java, there are two main categories of data types:
                    1. primitive and 
                    2. non-primitive (reference) data types.  
                    
    1. Primitive Data Types: These are the most basic data types in Java and include:
        - byte: 8-bit integer
        - short: 16-bit integer
        - int: 32-bit integer
        - long: 64-bit integer
        - float: 32-bit floating-point number
        - double: 64-bit floating-point number
        - char: a single 16-bit Unicode character
        - boolean: represents true or false values

        table format
        | Data Type | Size (bits) | Description                      |
        |-----------|-------------|----------------------------------|
        | byte      | 8           | Integer from -128 to 127         |
        | short     | 16          | Integer from -32,768 to 32,767   |
        | int       | 32          | Integer from -2^31 to 2^31-1     |
        | long      | 64          | Integer from -2^63 to 2^63-1     |
        | float     | 32          | Single-precision floating-point  |
        | double    | 64          | Double-precision floating-point  |
        | char      | 16          | Single Unicode character         |
        | boolean   | 1            | true or false                   |
        

    2. Non-Primitive Data Types: These are more complex data types that can hold multiple values or objects.
        - String: a sequence of characters, used to represent text.
        - Arrays: a collection of elements of the same type, stored in contiguous memory locations.
        - Classes: a blueprint for creating objects, which can contain fields (variables) and methods (functions).
        - Interfaces: a reference type in Java, similar to a class, that can contain only constants, method signatures,
            default methods, static methods, and nested types.
        - Enums: a special data type that enables for a variable to be a set of predefined constants.
        - And many more, as Java is an object-oriented programming language that allows for the creation of custom data types 
            through classes and interfaces.

    3. The choice of data type depends on the kind of data you want to store and the operations you want to perform on that data.

    4. In Java, all data types are statically typed, which means that the type of a variable must be declared at the time of its 
       creation and cannot be changed later.
 */

public class datatypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte myByte = 100; // Byte
        short myShort = 1000; // Short
        int myNum = 5; // Integer (whole number)
        long myLong = 1000000L; // Long
        float myFloatNum = 5.99f; // Floating point number
        double myDoubleNum = 10.5; // Double precision floating point number
        char myLetter = 'D'; // Character
        boolean myBool = true; // Boolean

        // Non-Primitive Data Type
        String myText = "Hello"; // String

        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myNum);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloatNum);
        System.out.println("double: " + myDoubleNum);
        System.out.println("char: " + myLetter);
        System.out.println("boolean: " + myBool);
        System.out.println("String: " + myText);
    }
}
