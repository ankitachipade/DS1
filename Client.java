import java.rmi.*;
import java.util.*;
public class Client
{
public static void main(String args[])
{
try
{
Calculate stub=(Calculate)Naming.lookup("rmi://localhost:5000/sonoo");
int num1 = 0;
int num2 = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter num1 : ");
num1 = sc.nextInt();
System.out.println("Enter num2 : ");
num2 = sc.nextInt();
System.out.println("Result : " + stub.calculate(num1,num2));
}
catch(Exception e){}
}
}