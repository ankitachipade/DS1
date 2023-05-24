import java.rmi.*;
public class Server
{
public static void main(String args[])
{
try
{
Calculate stub = new CalculateRemote();
Naming.rebind("rmi://localhost:5000/sonoo",stub);
}catch(Exception e)
{
System.out.println(e);
}
}
}