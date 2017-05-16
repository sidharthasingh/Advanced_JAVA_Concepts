import java.rmi.*;
class MyClient
{
	public static void main(String arg[])
	{
		try
		{
			MyInterface stub=(MyInterface)Naming.lookup("rmi://localhost:5000/sid");
			System.out.println(stub.add(1,2));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}