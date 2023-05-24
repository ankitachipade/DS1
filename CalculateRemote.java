import java.rmi.*;
import java.rmi.server.*; import java.util.*;
public class CalculateRemote extends UnicastRemoteObject implements Calculate
{
CalculateRemote()throws RemoteException
{
super();
}
public int calculate(int a, int b)
{
Scanner sc = new Scanner(System.in); System.out.println("1. Add");
System.out.println("2. Subtract"); System.out.println("3. Multiply"); System.out.println("4. Division"); System.out.println("5. Exit");
System.out.println("\nEnter your choice : ");
int ch = sc.nextInt();
switch(ch){
case 1:
{
return a+b;
}
case 2:
{
return a-b;
}
case 3:
{
return a*b;
}
case 4:
{
if(b!=0)
{
return a/b;
}
else
{
System.out.println("Division not possible...!");
}
}
case 5: System.exit(0);
default: System.out.println("\nInvalid choice");
return 0;
}
}
}