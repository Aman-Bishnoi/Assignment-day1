//Write a Java Program to check whether the given number is Perfect Numberor NOT
import java.util.Scanner;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        int sum = 0;
        for(int i=1; i< x; i++){
            if(x%i==0){
                sum += i;
            }

        }
        if(sum==x){
            System.out.println(x+" is a perfect number");
        }

        else{
            System.out.println(x+" is not a perfect number");
        }

    }
}
