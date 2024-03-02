class Room {

double height = 5.2;
double width = 4.5;
double breadth = 5.0;
double volume;


void calculateVolume(){
volume = height*width*breadth;
System.out.println(volume);
}
 public static void main(String args[]){
Room obj = new Room();
obj.calculateVolume();
}
}