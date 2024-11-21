//synchronized
class S
{
	int data;
	boolean turn=false;
	synchronized int get() //consume
	{
		if(!turn)
		{
			try {
				wait();
				
			}
			catch(InterruptedException e)
			{
				System.out.println("caught");
			}
		}
		
		
		System.out.println("Got"+data);
		turn=false;
		notify();
		return data;
	}
	synchronized void put(int n) //produce
	{
		if(turn)
		{
			try {
				wait();
				
			}
			catch(InterruptedException e)
			{
				System.out.println("caught");
			}
		}
		data=n;
		turn=true;
		System.out.println("put"+data);
		notify();
	}
}
class Producer implements Runnable
{
	S q;
	Producer(S q)
	{
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
		}
	}
}
class Consumer implements Runnable
{
	S q;
	Consumer(S q)
	{
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}
public class PC_sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
S q=new S();
new Producer(q);
new Consumer(q);
	}
}
