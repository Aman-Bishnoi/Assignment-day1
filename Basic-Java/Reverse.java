//Write a java program to Reverse a given number. 
import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number: ");
        int x = sc.nextInt();

        int y = 0;
        while(x!=0){
            y = y*10 + x%10; 
            x=x/10;
        }
        System.out.println("Reversed number :"+ y);
    }
    
}
