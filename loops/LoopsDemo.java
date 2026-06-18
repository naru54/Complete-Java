package loops;

import java.util.Scanner;

public class LoopsDemo {

    public static void main(String[] args) {

        // for (int i = 1; i <= 10; i++) {
        // if (i % 2 != 0) {
        // System.out.println(i);
        // }
        // }

        // System.out.println("Reverse order: ");
        // for (int i = 10; i >= 1; i--) {
        // System.out.println(i);
        // }

        // First 20 natural numbers
        // System.out.println("First 20 natural numbers: ");
        // for (int i = 1; i <= 20; i++) {
        // System.out.println(i);
        // }

        // sum of numbers from 1 to 100
        // System.out.println("Sum of numbers from 1 to 100: ");
        // int sum = 0;
        // for(int i=1 ; i<=100; i++){
        // sum += i;
        // }
        // System.out.println("sum is: " + sum);

        // System.out.println("factorial of a number: ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int fact = 1;
        // for(int i= 1; i<=num; i++){
        // fact *= i;
        // }
        // System.out.println("factorial of " + fact);

        // sc.close();

        // System.out.println("square: ");
        // for (int i = 1; i <= 5; i++) {
        // System.out.println(i + "*" + i + "=" + i*i);
        // }

        // System.out.println("reverse a number: ");
        // int num = 12345;
        // int reverse = 0;

        // for(; num !=0; num /= 10){
        // int rem = num%10;
        // reverse = reverse * 10 + rem;
        // }

        // System.out.println("reverse is: " + reverse);

        // count of digits in a given number
        // int num = 123456;
        // int count = 0;
        // while(num != 0){
        // count++;
        // num /= 10;
        // }
        // System.out.println("count of digits: " + count );

        // sum of digits
        // int num = 5552;
        // int sum = 0;
        // while(num !=0){
        // sum += num % 10;
        // num /=10;
        // }
        // System.out.println("sum is: " + sum);

        // palindrome
        // int num = 1271;
        // int original = num;
        // int reverse = 0;
        // while (num != 0) {
        // reverse = reverse * 10 + num % 10;
        // num /= 10;
        // }

        // if (reverse == original)
        // System.out.println("palindrome");
        // else
        // System.out.println("not a palindrome");

        // fibonacci series
        // int first = 0;
        // int second = 1;

        // System.out.print(first + " " + second + " ");
        // for (int i = 1; i <= 10; i++) {
        // int next = first + second;
        // System.out.print(next + " ");
        // first = second;
        // second = next;
        // }

        //--------- greatest common divisor -----------
        // int a = 24;
        // int b = 36;
        // while (b != 0) {
        // int temp = b;
        // b = a % b;
        // a = temp;
        // }
        // System.out.println(a);

        //------- lcm ---------
        // int a = 12;
        // int b = 18;

        // int x = a;
        // int y = b;
        // while (y != 0) {
        //     int temp = y;
        //     y = x % y;
        //     x = temp;
        // }
        // int gcd = x;
        // int lcm = (a * b) / gcd;
        // System.out.println("LCM = " + lcm);

        // ---------prime or not -----------------
        // int num = 29;
        // boolean prime = true;

        // if (num <= 1)
        // prime = false;

        // for (int i = 2; i <= Math.sqrt(num); i++) {
        // if (num % i == 0) {
        // prime = false;
        // break;
        // }
        // }

        // if (prime)
        // System.out.println("Prime");
        // else
        // System.out.println("Not Prime");

        // "Factors of a number always occur in pairs. If a number has a factor greater
        // than its square root, the corresponding factor must be smaller than the
        // square root. Therefore, by checking divisibility only up to √n, we can
        // determine whether the number is prime while reducing the time complexity from
        // O(n) to O(√n)."

    }
}
