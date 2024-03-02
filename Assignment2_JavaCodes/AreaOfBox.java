class Box{
float height; 
float width;
float breadth; 


Box(){}

Box(float a, float b, float c){
height = a;
width = b;
breadth = c;
}

float getVolume(){
float vol = height*width*breadth;
return vol;

}

float getArea(){
float area = 2*(height*width + width*breadth + breadth*height);
return area; 
}


public static void main(String args[]){

Box b1 = new Box();
b1.height = 6.1f;
b1.width = 8.2f;
b1.breadth = 6.5f;


Box b2 = new Box();
b2.height = 4.3f;
b2.width = 5.5f;
b2.breadth = 6.2f;

float b2area = b2.getArea();
float b2vol = b2.getVolume();
float b1vol=b1.getVolume();
float b1area=b1.getArea();
System.out.println("Volume of box 2 is:-" +b2vol);
System.out.println("area of box 2 is:-"+ b2area);
System.out.println("Volume of box 1 is:-" +b1vol);
System.out.println("area of box 1 is:-"+ b1area);

}

}