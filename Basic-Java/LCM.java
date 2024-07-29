//Write a java program to LCM of TWO given number. 

import java.util.Scanner;

public class LCM {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  first number: ");
        int x = sc.nextInt();
        System.out.print("Enter  second number: ");
        int y = sc.nextInt();
        int gcd=1;
        for(int i = 1; i<=x && i <= y; i++){
            if(x%i==0 && y%i==0){
                gcd = i;
            }
            
        }
        System.out.println("LCM of "+x+ " and "+y+" is "+ (x*y)/gcd);
    }
}
