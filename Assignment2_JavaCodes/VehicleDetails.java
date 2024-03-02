class Vehicle{

double price;
String colour;
String model;

Vehicle(double p, String c, String m){
 price=p;
 colour=c;
 model=m;
}

void display(){

System.out.println("Vehicle Model:- " + model+ " Vehicle Colour:- " + colour + " Vehicle price:- " + price);
}

public static void main(String args[]){

Vehicle obj = new Vehicle(340000.5, "White", "C8");
Vehicle obj1  = new Vehicle(350000.5, "Black", "C9");
Vehicle obj2 = new Vehicle(360000.5, "Grey", "C7");
obj.display();
obj1.display();
obj2.display();
}

}