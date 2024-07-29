//Write a Java Program to print the digits of a Given Number. 
import java.util.Scanner;

public class Digit {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit :");
        int x = sc.nextInt();
        String str = Integer.toString(x);

        for(int i = 0 ; i < str.length(); i++){
            System.out.println((i+1) + ": "+ str.charAt(i));
        }
    }
}
