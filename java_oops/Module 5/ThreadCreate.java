class NewThread extends Thread
{
	NewThread(String name)
	{
		super(name);
		System.out.println("child thread"+this);
		start();
	}
	
	synchronized public void run()
	{
		try
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("child thread"+i);
			Thread.sleep(1000);
		}
	}
		catch(InterruptedException e)
		{
			System.out.println("child thread is interrupted");
		}
		System.out.println("child is deleted");
}
}

public class ThreadCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NewThread t1=new NewThread("first thread");
NewThread t2=new NewThread("Second thread");
NewThread t3=new NewThread("Third thread");

	System.out.println("thread one is alive:"+t1.isAlive());
	System.out.println("thread two is alive:"+t2.isAlive());
	System.out.println("thread three is alive:"+t3.isAlive());
	
	try
	{
		t2.join();
		System.out.println("thread two xx is alive:"+t2.isAlive());
		System.out.println("thread one xx is alive:"+t1.isAlive());
		t1.join();
		t3.join();
	
}
catch(InterruptedException e)
{
	System.out.println("main thread is interrupted");
}

System.out.println("thread one is alive:"+t1.isAlive());
System.out.println("thread two is alive:"+t2.isAlive());
System.out.println("thread three is alive:"+t3.isAlive());

System.out.println("main thread is deleted");
	}

}
