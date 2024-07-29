//How to add two numbers without using the arithmetic operators in Java? 
import java.util.Scanner;

public class Addition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        for(int i = 1; i <= y; i++)
        {
            x++;
        }
        System.out.println("Sum of both numbers: "+x);
    }
}
