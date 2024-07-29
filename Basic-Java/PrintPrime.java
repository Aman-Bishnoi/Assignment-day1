//Write a Java Program to print Prime Numbers from 1 to N
import java.util.Scanner;

public class PrintPrime {
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;
    
            return true;
            
        
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Prime number upto:");
        int x = sc.nextInt();

        for(int i = 1; i <= x; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
            //PrintPrime.isPrime(i);
        }
    }
}
