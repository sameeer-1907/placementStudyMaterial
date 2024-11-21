
public class DemoThrow1 {

	void check(int marks) throws ArithmeticException,NullPointerException, ArrayIndexOutOfBoundsException
	{
		
		if(marks<50)
		{
			
			throw new ArithmeticException();
			
			
			
		}
		else
		{
			System.out.println("marks = "+marks);
		}
		
		
	}
	
	public static void main(String[] args) {
		DemoThrow1 dt=new DemoThrow1();
		try {
		dt.check(40);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured: Invalid marks");
			
		}
		
		
		

	}

}
