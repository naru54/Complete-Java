
public class literals {
   public static void main(String[] args) {
      int num = 0b1010; // Binary literal (10 in decimal)
      System.out.println("Binary literal (0b1010): " + num);

      int octalNum = 012; // Octal literal (10 in decimal)
      System.out.println("Octal literal (012): " + octalNum);

      int hexNum = 0xA; // Hexadecimal literal (10 in decimal)
      System.out.println("Hexadecimal literal (0xA): " + hexNum);

      int decimalNum = 10; // Decimal literal
      System.out.println("Decimal literal (10): " + decimalNum);

      int underscoreNum = 1_000_000; // Underscore in numeric literal for readability
      System.out.println("Numeric literal with underscores (1_000_000): " + underscoreNum);

      int binaryWithUnderscore = 0b1010_1010; // Binary literal with underscores
      System.out.println("Binary literal with underscores (0b1010_1010): " + binaryWithUnderscore);

      int octalWithUnderscore = 0_12_34; // Octal literal with underscores
      System.out.println("Octal literal with underscores (0_12_34): " + octalWithUnderscore);

      int hexWithUnderscore = 0xA_B_C; // Hexadecimal literal with underscores
      System.out.println("Hexadecimal literal with underscores (0xA_B_C): " + hexWithUnderscore);

      int decimalWithUnderscore = 1_000_000; // Decimal literal with underscores
      System.out.println("Decimal literal with underscores (1_000_000): " + decimalWithUnderscore);

      int a = 10; // Integer literal
      double b = 3.14; // Floating-point literal
      char c = 'A'; // Character literal
      String d = "Hello, World!"; // String literal
      boolean e = true; // Boolean literal

      System.out.println("Integer literal: " + a);
      System.out.println("Floating-point literal: " + b);
      System.out.println("Character literal: " + c);
      System.out.println("String literal: " + d);
      System.out.println("Boolean literal: " + e);
   }
}



/*
Literals in Java are fixed values that are directly represented in the code. They can be of various types, including:
1. Integer Literals: These represent whole numbers and can be expressed in decimal, binary, octal, or hexadecimal formats. For example:
   - Decimal: 10
   - Binary: 0b1010
   - Octal: 012
   - Hexadecimal: 0xA

2. Floating-point Literals: These represent decimal numbers and can be expressed in standard or scientific notation. For example:
   - Standard: 3.14
   - Scientific: 1.5e2 (which is 150.0) 

3. Character Literals: These represent single characters enclosed in single quotes. For example:
   - 'A'
   - '1'
   - '\n' (newline character)

4. String Literals: These represent sequences of characters enclosed in double quotes. For example:
   - "Hello, World!"

5. Boolean Literals: These represent the two boolean values: true and false.

6. Underscores in Numeric Literals: Java allows the use of underscores in numeric literals to improve readability. For example:
   - 1_000_000 (which is 1000000)
   - 0b1010_1010 (binary literal with underscores)
   - 0xA_B_C (hexadecimal literal with underscores)
*/

