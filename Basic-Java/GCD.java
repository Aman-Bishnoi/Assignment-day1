//Write a Java Program to find GCD(Greatest Common division) of two given numbers.
import java.util.Scanner;

import java.util.Scanner;

public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  first number: ");
        int x = sc.nextInt();
        System.out.print("Enter  second number: ");
        int y = sc.nextInt();
        int gcd=1;
        for(int i = 1; i<=x && i <= y; i++){
            if(x%i==0 && y%i==0){
                gcd = i;
            }
            
        }
        System.out.println(gcd);
    }
}
