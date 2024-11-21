class Counter implements Runnable
{
	int count=100;
	Thread t;
	//boolean running=true;
	Counter(int plevel)
	{
		t=new Thread(this);
		t.setPriority(plevel);
		int p=t.getPriority();
		System.out.println("the prority ="+p);
		t.start();
	}
	public void run()
	{
		while(count>0)
		{
			count--;
			System.out.println(count);
		}
		
	}
	public void stop()
	{
		//running=false;
	}
	
}
public class PriEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Thread.currentThread().setPriority(Thread.NORM_PRIORITY+2);
//System.out.println("current thread priority");		
Counter c1=new Counter(Thread.NORM_PRIORITY+2);


	}

}
