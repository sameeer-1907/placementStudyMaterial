
public class TestException4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		//throw new ArithmeticException();
		//throw new ArrayIndexOutOfBoundsException();
		throw new NullPointerException(); 
		}
		catch(ArithmeticException e)
		{
			System.out.println("Using throw keyword to throw exception manually and catching the thrown exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Using throw keyword to throw exception manually and catching the thrown exception");
		}
		catch(NullPointerException e)
		{
			System.out.println("Using throw keyword to throw exception manually and catching the thrown exception");
		}

	}

}
