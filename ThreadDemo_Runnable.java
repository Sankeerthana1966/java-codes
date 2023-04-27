class T2 implements Runnable{
	public void run()
	{
		System.out.println("This code is running in a thread");
	}
}
public class ThreadDemo_Runnable
{
	public static void main(String args[])
	{
		T2 obj=new T2();//default priority will be 5,by default name of thread is Thread0
		Thread thread=new Thread(obj);
		thread.start();
		System.out.println("this code is outside of the thread");
	}
}