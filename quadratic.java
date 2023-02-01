import java.util.*;

class main{
public static void main(String args[])
{
 System.out.println("Enter the coefficeints of quadratic equation");
Scanner sc= new Scanner(System.in);
double a=sc.nextDouble();
double b= sc.nextDouble();
double c=sc.nextDouble();
double d=(b*b)-(4*a*c);
double r1,r2;
 if(a==0){
  System.out.println("invlaid quadratic expression");
 }
 else{
if(d>0){
System.out.println("The roots are real and distinct");
r1=(-b+Math.sqrt(d))/(2*a);
r2=(-b-Math.sqrt(d))/(2*a);
System.out.print("The root r1 is "+r1);
System.out.print("The root r2 is "+r2);
}
if(d==0){
r1=r2=(-b)/(2*a);
System.out.println("The roots are equal");
System.out.print("The root r1,r2 are equal to "+r1);
}
else{
System.out.println("Roots are imaginary");
r1=(-b)/(2*a);
r2=(Math.sqrt(-d))/(2*a);
System.out.println("The first root is "+ r1+ "+i"+r2);
System.out.println("The first root is "+ r1+ "-i"+r2);
}
 }
}
}
