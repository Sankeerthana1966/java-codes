//demonstrate method overloading
class OverloadDemo
{
	void test()
	{
		System.out.println("No parameter");
	}
	void test(int a)
	{
		System.out.println("a: "+a);
	}
	void test(int a,int b)
	{
		System.out.println("a and b: "+a+" "+b);
	}
	double test(double a)
	{
		System.out.println("double a: "+a);
		return a*a;
	}
}
class Overload
{
	public static void main(String args[])
	{
		OverloadDemo obj=new OverloadDemo();
		double result;
		obj.test();
		obj.test(10);
		obj.test(10,20);
		result=obj.test(123.34);
		System.out.println("Result of obj.test(123.34): "+result);
	}
}
	