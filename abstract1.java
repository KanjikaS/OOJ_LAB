import java.util.*;

 abstract class shape{
int a,b;
double area;
double pi=3.14;
 public shape(int x,int y)
{ this.a=x;
 this.b=y;
}
abstract void  PrintArea();
}

class Rectangle extends shape{
 public Rectangle(int a,int b){
super(a,b);
}
void PrintArea(){
area=a*b;
System.out.println("Area of rectangle is " +area);
}
}


class Triangle extends shape{
public Triangle(int a,int b){
super(a,b);
}
void PrintArea(){
area=0.5*a*b;
System.out.println("Area of Triangle is " +area);
}
}


class Circle extends shape{
 public Circle(int a){
super(a,-1);
}
void PrintArea(){
area=pi*Math.pow(a,2);
System.out.println("Area of is  Circle " +area);
}
}






class abstract1{
public static void main(String args[]){
int choice;
int l,b;
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("Enter your choice\n1.Rectangle\n2.Circle\n3.Triangle\n4.Exit");
choice=sc.nextInt();
switch(choice){
case 1: System.out.println("enter length and breadth");
        l=sc.nextInt();
        b=sc.nextInt();
        Rectangle r1=new Rectangle(l,b);
        r1.PrintArea();
        break;
case 2: System.out.println("enter  radius");
       l=sc.nextInt();
//        b= sc.nextInt();
       Circle c=new Circle(l);
        // c.a= sc.nextInt();
        // c.b= sc.nextInt(c.a)
        c.PrintArea();
        break;
case 3: System.out.println("enter perpendicular and base");
l=sc.nextInt(); 
    b=sc.nextInt();
       Triangle t=new Triangle(l,b);
       
        t.PrintArea();
        break;
// case 4: exit(0);

       
        



 }
}
}
}

 
