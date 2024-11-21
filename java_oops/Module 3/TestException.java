
public class TestException {
	public static void main(String[] args) {
		
		try {
			int x=0;
			System.out.println("Hello1");
			int arr[]={10,20,30};
			System.out.println(arr[3]);
			int a=20/x;
			System.out.println(a);
			
			
			

			
			}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("element not available");
			System.out.println(e);
		}
		
		
		
		catch(ArithmeticException e)
			{
					System.out.println("Don't divide by 0");
					System.out.println(e);
				}
		catch(Exception e)
		{
			System.out.println("caught inside Exception parent class");
			//System.out.println("caught inside Exception parent class");
		}
		
		//try {int arr[]={10,20,30};
		//System.out.println(arr[3]);}
		//catch(ArrayIndexOutOfBoundsException e)
		//{
			//System.out.println("element not available");
			//System.out.println(e);
	//	}
		
			
			System.out.println("Hello");

	}

}
