import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int fact=1;
		System.out.println("Factorial of "+n+" is:- ");
		for(int i=1; i<=n; i++){
			fact=fact*i;

		}
		System.out.println(fact);
	}


}