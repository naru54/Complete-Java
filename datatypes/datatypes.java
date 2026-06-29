package datatypes;
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
        
        //interface, class, and array are also non-primitive data types. 
        // object is also a non-primitive data type, but it is not a data type itself. 
        // It is a class that can be used to create objects.

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
        | Data Type | Size (bits) | default value     | Description                      |
        |-----------|-------------|-------------------|----------------------------------|
        | byte      | 8           | 0                 | Integer from -128 to 127         |
        | short     | 16          | 0                 | Integer from -32,768 to 32,767   |
        | int       | 32          | 0                 | Integer from -2^31 to 2^31-1     |
        | long      | 64          | 0L                | Integer from -2^63 to 2^63-1     |
        | float     | 32          | 0.0f              | Single-precision floating-point  |
        | double    | 64          | 0.0d              | Double-precision floating-point  |
        | char      | 16          | '\u0000'          | Single Unicode character         |
        | boolean   | 1           | false             | true or false                    |

        Overflow:  When a value exceeds the maximum limit of a data type, it wraps around to the minimum limit. 
                  For example, if you add 1 to the maximum value of an int (2^31 - 1), it will wrap around to the 
                  minimum value (-2^31).
                    Example:
                        int maxInt = Integer.MAX_VALUE; // 2147483647
                        int overflowInt = maxInt + 1; // This will overflow and wrap around to -2147483648
                        System.out.println("Overflow example: " + overflowInt); // Output: -2147483648
        
        Underflow: When a value goes below the minimum limit of a data type, it wraps around to the maximum limit. 
                    For example, if you subtract 1 from the minimum value of an int (-2^31), it will wrap around to the 
                    maximum value (2^31 - 1).
                        Example:
                            int minInt = Integer.MIN_VALUE; // -2147483648
                            int underflowInt = minInt - 1; // This will underflow and wrap around to 2147483647
                            System.out.println("Underflow example: " + underflowInt); // Output: 2147483647
        
        Floating point values can also experience overflow and underflow.
        For example, if you try to assign a value larger than the maximum value of a float (3.4028235e+38) to a float variable, 
        it will result in infinity.
            Example:
                float maxFloat = Float.MAX_VALUE; // 3.4028235e+38
                float overflowFloat = maxFloat * 2; // This will overflow and result in infinity
                System.out.println("Overflow example: " + overflowFloat); // Output: Infinity
                float minFloat = Float.MIN_VALUE; // 1.4e-45
                float underflowFloat = minFloat / 2; // This will underflow and result
                System.out.println("Underflow example: " + underflowFloat); // Output: 0.0

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


