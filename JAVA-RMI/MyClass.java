import java.rmi.*;
import java.rmi.server.*;
public class MyClass extends UnicastRemoteObject implements MyInterface
{
	MyClass() throws RemoteException
	{
		super();
	}

	public int add(int x,int y) throws RemoteException
	{
		return x+y;
	}
}