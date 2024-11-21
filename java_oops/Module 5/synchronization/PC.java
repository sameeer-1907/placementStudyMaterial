//unsynchronized
class S
{
	int data;
	synchronized int get() //consume
	{
		System.out.println("Got"+data);
		return data;
	}
	synchronized void put(int n) //produce
	{
		data=n;
		System.out.println("put"+data);
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
public class PC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
S q=new S();
new Producer(q);
new Consumer(q);
	}
}
