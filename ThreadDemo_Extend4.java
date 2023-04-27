class T1 extends Thread{
	public void run()
	{
		System.out.println("This code is running in a thread");
		System.out.println("Thread Name:"+getName());
		System.out.println("Thread priority:"+getPriority());
		//Thread priorities are integers we can use min,max and Norm other than numbers
		System.out.println("Thread State:"+getState());
	}
}
public class ThreadDemo_Extend4
{
	public static void main(String args[])
	{
		T1 obj1=new T1();
		obj1.setName("hello java");
		obj1.start();
		obj1.setPriority(1);
		//obj1.start();
		System.out.println("This code is outside of a thread");
	}
}