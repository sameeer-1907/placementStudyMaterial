class A
{
	void methodName()
	{
		try {
			int arr[]= {10,20};
			arr[2]=30/0;
			
			
		}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBounds Exception");
	}
	catch(ArithmeticException e)
	{
			System.out.println("Don't divide by 0");
			System.out.println(e);
		}
		
	}
	
}

public class TestException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.methodName();
		

}
}
