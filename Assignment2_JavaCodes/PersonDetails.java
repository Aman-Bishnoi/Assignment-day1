class Person{

float age;
float height;
int weight;

Person(){
age = 29.0f;
height = 5.9f;
weight = 60;

}

Person(float a, float h, int w){
age=a;
height=h;
weight=w;
}

void display(){
System.out.println("Age is :- "+ age);
System.out.println("Height is :- "+ height);
System.out.println("Weight is :- "+ weight);
}

public static void main(String args[]){

Person per1 = new Person();
Person per2 = new Person(25.0f, 5.5f, 50);

per1.display();
per2.display();


}
}