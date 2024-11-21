
public class TestException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int arr[]= {10,20};
			arr[2]=30;
			
			try {
				//int z=10/0;
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Exception");
			}
			
			
		}
		
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound");
			
			
			
		}
		
		
	}

}
