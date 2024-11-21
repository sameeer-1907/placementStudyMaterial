
public class TestException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			
			try {
				
				int z=10/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("inner try1");
			}
			
			try
			{
				int arr[]= {10,20};
				arr[2]=30;
			}
			
			finally
			{
				System.out.println("inner finally");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled from outer try");
		}
		finally {}
		
		
	}
}
