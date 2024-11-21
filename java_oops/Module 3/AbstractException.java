abstract class Bike
{
	Bike()
	{
		System.out.println("constructor of Bike created in abstract base class Bike");
	}

	abstract void run();
	void changeGear() throws ArithmeticException
	{
		System.out.println("Non-abstract method from abstract class: gear changed");
		throw new ArithmeticException();
	}
}

class Honda extends Bike
{
	
	Honda()
	{
		System.out.println("constructor of Honda created in derived class Honda");
	}
	
	void run()
	{
		System.out.println("hello from abstract method dereived from abstract class");
	}
}



public class AbstractException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Bike obj=new Honda();
		obj.run();
		obj.changeGear();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught exception thrown inside abstract class");
		}

	}

}
