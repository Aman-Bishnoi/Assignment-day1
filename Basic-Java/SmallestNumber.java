//Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol?

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.print("Enter third number: ");
        int z = sc.nextInt();
        int c = 0;
        while(x!=0 && y!=0 && z!=0 ){
            x--;
            y--;
            z--;
            c++;
        }

        System.out.println("Smallest number is "+c);
    }
}
