package typeCasting;

public class typeConversion {
    public static void main(String[] args) {
        // Implicit Type Conversion (Widening)
        int num1 = 10;
        double num2 = num1; // int to double
        System.out.println("Implicit Conversion: " + num2);

        // Explicit Type Conversion (Narrowing)
        double num3 = 9.78;
        int num4 = (int) num3; // double to int
        System.out.println("Explicit Conversion: " + num4);
    }
}

/*
  Type Conversion:
  Type conversion is the process of converting a value from one data type to another.
  In Java, there are two types of type conversion: implicit and explicit.
  
  1. Implicit Type Conversion (Widening):
  - This occurs when a smaller data type is converted to a larger data type automatically by the compiler.
  - Example: int to double, float to double, etc.
  
  2. Explicit Type Conversion (Narrowing):
  - This occurs when a larger data type is converted to a smaller data type manually by the programmer using casting.
  - Example: double to int, long to short, etc.

  Type Casting:
    - Type casting is the process of converting a variable from one type to another.
    - In Java, you can perform type casting using the syntax: (targetType) value.
    - For example, to convert a double to an int, you would use: int num = (int) myDouble;
    - When performing explicit type conversion, you need to be careful as it can lead to data loss if the target type cannot 
      hold the value of the source type.
    - For example, converting a double with a fractional part to an int will result in the loss of the fractional part.
        double num = 9.78;
        int numInt = (int) num; // numInt will be 9, losing the .78
        System.out.println("Explicit Conversion: " + numInt);

  
  Table format for type conversion:
  | Source Type | Target Type | Conversion Type      | Description |
  |-------------|-------------|------------------    |----------------------------- ---------------------|
  | int         | double      | Implicit (Widening)  | Automatically converts int to double              |
  | double      | int         | Explicit (Narrowing) | Requires casting to convert double to int         |
  | float       | double      | Implicit (Widening)  | Automatically converts float to double            |
  | double      | float       | Explicit (Narrowing) | Requires casting to convert double to float       |
  | long        | int         | Explicit (Narrowing) | Requires casting to convert long to int           |
  | int         | long        | Implicit (Widening)  | Automatically converts int to long                |
  | char        | int         | Implicit (Widening)  | Automatically converts char to int                |
  | int         | char        | Explicit (Narrowing) | Requires casting to convert int to char           |
  
  3. It's important to be cautious when performing explicit type conversion, as
     it can lead to data loss if the target type cannot hold the value of the source type.
         For example, converting a double with a fractional part to an int will result in the loss of the fractional part.
            double num = 9.78;
            int numInt = (int) num; // numInt will be 9, losing the .78

  4. Some types cannot be converted to each other directly, such as boolean to int or char to boolean, and will require
     additional logic to handle the conversion.
        For example, to convert a boolean to an int, you might use a conditional statement to assign 1 for true and 0 for false.
        another example, to convert a char to a boolean, you might check if the char is equal to a specific character.
            char myChar = 'Y'; // char to boolean
            boolean myBool = (myChar == 'Y'); // Assign true if char is 'Y', false otherwise
            System.out.println("Boolean value: " + myBool);

  
  5. We cannot convert char to byte directly, but we can convert char to int and then int to byte if the char value is within the 
     byte range (0 to 255).
        char myChar = 'A'; // char to int
        int myInt = myChar; // int to byte (if within range)
 
  6. Incompatible types, such as converting a String to an int, will require parsing the String to extract the numeric value
   before conversion.
   for example, to convert a String to an int, you can use the Integer.parseInt() method:
        String strNum = "123";
        int num = Integer.parseInt(strNum); // String to int
   To convert an int to a String, you can use the Integer.toString() method:
        int num = 123;
        String strNum = Integer.toString(num); // int to String
        System.out.println("String representation: " + strNum);
 
  To avoid confusion and potential errors, it's best to use explicit type conversion when there is a possibility of data loss or
  when converting between incompatible types.
  
  Also note that in Java, type conversion can also occur with reference types(non-primitive data types) through the use of
inheritance and interfaces,but that is a more advanced topic that goes beyond the scope of basic type conversion.
 */
