//one interface can extends another
interface A
{
	void math1();
	void math2();
}
interface B extends A
{
	void math3();
}
class Myclass implements B{
	public void math1()
	{
		System.out.println("Implements math1().");
	}
	public void math2()
	{
		System.out.println("Implements math2().");
	}
	public void math3()
	{
		System.out.println("Implements math3().");
	}
	class IFExtend
	{
		public static void main(String args[])
		{
			Myclass obj=new Myclass();
			obj.math1();
			obj.math2();
			obj.math3();
		}
	}
}
	