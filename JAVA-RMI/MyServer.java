import  java.rmi.*;
import java.rmi.registry.*;
class MyServer
{
	public static void main(String arg[])
	{
		try
		{
			MyInterface stub=new MyClass();
			Naming.rebind("rmi://localhost:5000/sid",stub);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}