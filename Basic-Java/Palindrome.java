//Check whether the Given Numberis a Palindrome or NOT.
import java.util.Scanner;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number: ");
        int num = sc.nextInt();
        int x = num;
        int y = 0;
        while(x!=0){
            y = y*10 + x%10; 
            x=x/10;
        }
        if(y==num){
            System.out.println(num+ " is a palindrome");
        }
        else{
            System.out.println(num+" is not a palindrome");
        }
    }
}
