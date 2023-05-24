import java.rmi.*;
public interface Calculate extends Remote
{
public int calculate(int x, int y)throws RemoteException;
}