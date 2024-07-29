//Swap two numbers without using third variable.
public class Swap {
    public static void main(String args[]){
        int x = 4;
        int y = 5;
        System.out.println("x and y before swapping");
        System.out.println(x +" , "+y);
        y = x+y; // y= 4+5 //9
        x = y - x; // x=9-4=5
        y = y- x; // y=9-5=4
        System.out.println("x and y after swapping");
        System.out.println(x +" , "+y);
    }
}
