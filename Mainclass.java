//using final keyword.
final class A{
	 void show()
	 {
		 System.out.println("hello");
	 }
	
}
class B extends A
{
	void dis()
	{
		System.out.println("child class");
	}
}
class Mainclass{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		b.dis();
		a.show();
		//b.dis();
	}
}


























































































































































































































































































































































































































































