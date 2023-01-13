import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        int num1, num2;
        int result;
        Scanner sc=new Scanner(System.in);
        try 
        {
            System.out.println("Enter the dividend:");
            num1=Integer.parseInt(sc.nextLine());
            System.out.println("Enter the divisor:");
            num2=Integer.parseInt(sc.nextLine());
            if(num2<0)
            throw new ArithmeticException();
            else
            {
                result=num1/num2;
                System.out.println("Quotient is: "+result);
            }
            
        } 
        catch(NumberFormatException e) 
        {
            System.out.println("Enter only an integer number!");
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divisor cannot be zero!");
            System.out.println(e);
        }
        finally
        {
            System.out.println("End of program!");
        }
    }
}

