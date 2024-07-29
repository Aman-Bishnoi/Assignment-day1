//Write a Java Program to print Armstrong Numbers upto a limit.

import java.util.Scanner;

import java.util.Scanner;

public class Armstrongs {

    public static boolean isArmstrong(int n){
        int temp=n, digit=0, sum=0, last;

        while(temp>0){
            temp = temp/10;
            digit++;

        }

        temp = n;

        while(temp>0){
            last = temp%10;
            sum+= Math.pow(last, digit);
            temp=temp/10;
        }

        if(n==sum){
            return true;
        }
        else{
            return false;
        }
    }
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        
        System.out.println("Armstrong numbers upto "+ x+ " :");
        for(int i = 0; i <= x; i++){
        if(isArmstrong(i)){
            System.out.print(i+", ");
        }
        }
    } 
}
