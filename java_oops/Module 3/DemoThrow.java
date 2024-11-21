
public class DemoThrow {
	 void Check(int marks) throws ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException
	 {
		 
		 
		 try {		 
		 if(marks<50)
		 { 
			 
			 throw new ArithmeticException();
			
		
		 }
			
			 		 
		 else
		 {
			 
			 System.out.println("marks"+marks);
		 }
		 }
			catch(ArithmeticException e)
			{
				System.out.println("Exception has occured : invalid input");
				System.out.println(e);
			
				throw e;
			}
		 finally
		 {
			 System.out.println("Finally here: sure to excute");
		 }
		 
		 
		 //throw new NullPointerException();
		 
		 
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		DemoThrow dt=new DemoThrow();
		
		dt.Check(40);
		
		
		
		
	}

}
