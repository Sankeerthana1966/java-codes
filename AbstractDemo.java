//abstract method implementation
abstract class A
{
	abstract void display();
	void show()
	{
		System.out.println("Hi, ");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("This is child method");
	}
	void happy()
	{
		System.out.println("happy");
	}
}
class AbstractDemo
{
	public static void main(String args[])
	{
		B ol=new B();
		ol.display();
		ol.show();
		ol.happy();
	}
}
	
		