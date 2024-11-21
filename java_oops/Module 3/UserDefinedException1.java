
class MyException1 extends RuntimeException
{
	String str;
	MyException1(String s)
	{
	str=s;	
	}
}

public class UserDefinedException1 {

	public static void main(String[] args) {
		
		throw new MyException1("My error message");
		
	}

}
