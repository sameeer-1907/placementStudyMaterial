
class MyException extends Exception
{
	String str1;
	MyException(String s)
	{
		str1=s;
	}
	
	
	
}

public class UserDefinedException {

	public static void main(String[] args) {
	try
	{
		throw new MyException("error");
	}
	catch(MyException e)
	{
		System.out.println("hi");
	}

	}

}
