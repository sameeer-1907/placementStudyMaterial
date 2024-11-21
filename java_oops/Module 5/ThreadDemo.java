import java.lang.*;
import java.util.*;
/*
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=Thread.currentThread();
		System.out.println("the current thread:"+t);
		t.setName("oop thread");
		
		System.out.println("the new name:"+t);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("you are interrupting sleep");
		}
		
	}

}
*/

/*
class ThreadDemo {
	public static void main(String args[]) {
Thread t = Thread.currentThread();
System.out.println("Current thread: " + t);
// change the name of the thread
t.setName("My Thread");
System.out.println("After name change: " + t);


	try {
		for(int n = 5; n > 0; n--) 	{
		System.out.println(n);
		Thread.sleep(2000);
							}
		} catch (InterruptedException e) {
				System.out.println("Main thread interrupted");
		}
				}
				
					}

*/
/*
class MyThread1 extends Thread
{
	

		public void run()
		{
			int i=100;
			while(i>0)
				{
					System.out.println("Thread 1 is running"+this);
					i--;
				}
		}
}
class MyThread2 extends Thread
{
		public void run()
		{
			int i=100;
			while(i>0)
				{
					System.out.println("Thread 2 is running"+this);
					i--;
				}
		}
}
public class ThreadDemo
{
	public static void main(String args[])
		{
			MyThread1 t1=new MyThread1();
			 MyThread2 t2=new MyThread2();
			 t1.setPriority(6);
			 t2.setPriority(7);
			t1.start();
			t2.start(); //start() will call run() internally
		}
}
*/




class Thread1 implements Runnable
{
	//String name;
	
	
	Thread1()
	{
		
		Thread t=new Thread(this,"Demo thread");
		System.out.println("child thread"+this);
		t.start();
	}
	public void run()
	{
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println("child thread"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("child thread is interrupted");
		}
		System.out.println("child thread is terminated");
	}
}



public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Thread1();

try{
	for(int i=0;i<5;i++)
	{
		System.out.println("main thread"+i);
		Thread.sleep(3000);
	}
}
catch(InterruptedException e)
{
	System.out.println("main thread interrupted");
}
System.out.println("main thread is terminated");
	}

}

  
 
