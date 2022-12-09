import java.util.*;
class book{
String name,author;
int price,num_pages;
 void book(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter book name");
name=sc.nextLine();
System.out.println("Enter author name");
author=sc.nextLine();
System.out.println("Enter price");
price=sc.nextInt();
System.out.println("Enter number of pages");
num_pages=sc.nextInt();
}
void get(){
System.out.println("The details of the book are as follows");
System.out.println("");
System.out.println("Book-Name : " + name+"\n");
System.out.println("Book-Author : " + author+"\n");
System.out.println("Book-Price : " + price+"\n");
System.out.println("Book-Pages: " + num_pages+"\n");
System.out.println("");
System.out.println("");
}
}
 

class week3{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
 int n;
System.out.println("Enter the number of books ");
n=sc.nextInt();
book b[]=new book[n];
for(int i=0;i<n;i++){
b[i]=new book();
}
for(int i=0;i<n;i++){
b[i].book();
// b[i].display();
}
for(int i=0;i<n;i++){

b[i].get();
}
}
}




