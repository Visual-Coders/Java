// Multithreading.java

public class Multithreading extends Thread
{
	public void run()
	{
		for (int i=1;i<=3;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e){};
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}	
	}
	public static void main(String[]args)
	{
		Multithreading t1 = new Multithreading();
		Multithreading t2 = new Multithreading();
		Multithreading t3 = new Multithreading();
		t1.start();
		t2.start();
		t3.start();
	}
}
