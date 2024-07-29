//Write a Java Program to find sum of the digits of a given number.
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit :");
        int num = sc.nextInt();
        int x= num;
        String str = Integer.toString(x);
        int sum = 0;
        while (x != 0) {
            sum += x % 10; // Add the last digit to sum
            x /= 10;       // Remove the last digit
        }

        System.out.println("Sum of digits of "+ num + " is : "+ sum);
    }
}
    