class NewTread1 implements Runnable
{
	String name;
	Thread t;
	boolean flag;
	NewTread1(String threadname)
	{
		name=threadname;
		t=new Thread(this,name);
		System.out.println("new thread"+t);
		flag=false;
		t.start();
	}
	public void run()
	{
		try {
			for(int i=1;i<15;i++)
			{
				System.out.println(name+i);
				Thread.sleep(1000);
				synchronized(this)
				{
					while(flag)
					{
						wait();
				}
			}
		}
	}
		catch(InterruptedException e)
		{
			System.out.println("interrupted");
		}
		System.out.println(name+"exiting");
}
	synchronized void myResume()
	{
		flag=false;
		notify();
	}
	synchronized void mySuspend()
	{
		flag=true;
	}
		
	}
	
	
public class SuspendResume1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NewTread1 o1=new NewTread1("first");
NewTread1 o2=new NewTread1("second");
try {
	Thread.sleep(1000);
	o1.mySuspend();
	System.out.println("suspend thread first");
	Thread.sleep(1000);
	o1.myResume();
	Thread.sleep(1000);
	o2.mySuspend();
	System.out.println("suspend thread second");
	Thread.sleep(1000);
	o2.myResume();
} catch(InterruptedException e)
{
	System.out.println("interrupted");
}
	}

}
