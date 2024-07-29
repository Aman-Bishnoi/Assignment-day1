//Write a Java Program to check whether the given number is Armstrong Number or NOT

import java.util.Scanner;

import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        String str = Integer.toString(x);
        int temp = x;
        int remainder;
        int result = 0;

        while(temp != 0){
            remainder = temp%10;
            result += Math.pow(remainder, str.length());
            temp/=10;
        }
        if(result==x){
            System.out.println("It is a armstrong");
        }
        else{
            System.out.println("It is not a armstrong"); 
        }
    }
     
}