//Write a Java Program to find the Factorialusing recursion. 
import java.util.Scanner;

public class FactRecursion {

    public int findFact(int i){
        if(i==0){
            return 1;
        }
        else{
            return i*findFact(i-1);
        }
    }
    public static void main(String args[]){
        FactRecursion obj = new FactRecursion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        System.out.println(obj.findFact(x));
    }
}
