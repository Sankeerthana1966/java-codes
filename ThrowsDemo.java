//we can use thrown keyword instead of try and catch blocks also
class ThrowsDemo
{
	static void throwOne() throws IllegalAccessException{
		System.out.println("Inside throwsOne.");
		throw new IllegalAccessException("demo");
	}
	public static void main(String args[])
	{
		try{
			throwOne();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Caught "+e);
		}
	}
}
			