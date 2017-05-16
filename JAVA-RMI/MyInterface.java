import java.rmi.*;
public interface MyInterface extends Remote
{
	int add(int x,int y) throws RemoteException;
}