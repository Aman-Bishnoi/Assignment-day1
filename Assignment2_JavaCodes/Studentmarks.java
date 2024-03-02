class Student{
String name;
int maths;
int english;
int science;

void marks(int a, int b, int c){
maths =a;
english = b;
science = c;
}

void avgOfMarks(){
float avg = (maths+science+english)/3;
System.out.println("Average is:-" +avg);
}

void nameAndMarks(){
System.out.println("Student name :-" +name);
System.out.println("Total marks :-" +(maths+science+english));
}

public static void main(String args[]){

Student s = new Student();
s.name = "Aman";
s.marks(55,95,80);
s.avgOfMarks();
s.nameAndMarks();


}

}

