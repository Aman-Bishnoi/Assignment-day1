//Write a Java Program to print all the Factors of the Given number.
import java.util.Scanner;

public class Factor {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit :");
        int x = sc.nextInt();

        for(int i = 1; i <= x; i++ ){
            if(x%i==0){
                System.out.print(i+" ");
            }
        }
}
}
