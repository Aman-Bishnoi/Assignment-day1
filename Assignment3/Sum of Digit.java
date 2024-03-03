import java.util.Scanner;
class Code15{
	public static void main(String args[]){
	int i,n;
	int sum=0;
	System.out.println("Enter the number: ");
	Scanner r = new Scanner(System.in);
	n=r.nextInt();
 		do {
			i=n%10;
			sum = sum +i;
			n = n/10;
		}
		while(n>0);
			System.out.println("Sum is :" +sum);
		
			
	
	}
}