

import java.util.Scanner;
class Student{
String name;
String  USN;
int total_credits=0;
int sum=0;
void accept(String n,String USN){
this.name=n;
this.USN=USN;
}
void display(){
System.out.println("The name of student is  "+ this.name);
System.out.println("The USN of student is  "+ this.USN);
}
void calculate(int credits[],int marks[]){
   for(int i=0;i<5;i++){
total_credits+=credits[i];
if(marks[i]>=90 && marks[i]<=100){
    sum= sum+10*credits[i];
}
else if(marks[i]>=80 && marks[i]<90){
    sum=sum+9*credits[i];
}
else if(marks[i]>=70 && marks[i]<80){
    sum=sum+8*credits[i];
}
else if(marks[i]>=60 && marks[i]<70){
    sum=sum+7*credits[i];
}
else if(marks[i]>=55 && marks[i]<60){
    sum=sum+6*credits[i];
}
else if(marks[i]>=50 && marks[i]<55){
    sum=sum+5*credits[i];
}
else if(marks[i]>=40 && marks[i]<50){
    sum=sum+4*credits[i];
}
else if(marks[i]<40){
    sum=sum+0*credits[i];
}
}


System.out.println("The total credits are " + total_credits);
System.out.println("The creditS x by your score grade point is "+ sum);
double SGPA= (double)sum/total_credits;
System.out.println("Your SGPA is " + SGPA);



}
}


class SGPA{
    public static void main(String[] args) {
int []credits= new int [10];
int [] marks=new int[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name of student");
         String a=sc.nextLine();
          System.out.println("enter the usn of student");
          String b=sc.nextLine();
          Student s1= new Student();
          s1.accept(a,b);
          System.out.println("enter the marks of following subject one by onen1.Maths\n 2.DBMS\n3.DST\n4.OOj\n5.LD");
         for(int i=0;i<5;i++){
             marks[i]=sc.nextInt();
         }
         System.out.println("enter the credits of following subject one by one\n1.Maths\n 2.DBMS\n3.DST\n4.OOj\n5.LD");
         for(int i=0;i<5;i++){
             credits[i]=sc.nextInt();
         }
          s1.display();
         s1.calculate(credits,marks);
        
    }
}
