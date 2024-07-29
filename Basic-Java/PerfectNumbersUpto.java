//Write a Java Program to print Perfect Numbers upto a limit.

import java.util.Scanner;

import java.util.Scanner;

public class PerfectNumbersUpto {
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i = 1; i<n; i++){
            if(n%i==0){
                sum += i;
            }
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int x = sc.nextInt();

        System.out.println("Perfect number from 1 to "+x+" are: ");
        for(int i = 1; i <= x; i++){
            if(isPerfect(i)){
                System.out.print(i+", ");
            }
        }
    }
}
