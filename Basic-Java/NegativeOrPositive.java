//How to check the given number is Positive or Negative? 
import java.util.Scanner;

public class NegativeOrPositive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();

        if(x<0){
            System.out.println(x +" is negative");
        }
        else{
            System.out.println(x +" is positive ");
        }
}
}