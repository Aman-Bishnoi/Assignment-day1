// Write a Java Program to find whether given number is Leap year or NOT? 
import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year :");
        int x = sc.nextInt();

        if(x%400==0 && x%100==0 || x%400==0 || x%4==0 && x%100!=0){
            System.out.println(x +" is a leap year");
        }
        else{
            System.out.println(x +" is not a leap year ");
        }
}
}
