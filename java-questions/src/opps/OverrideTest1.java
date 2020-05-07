package opps;


class A
{
	public A()
	{
		print();
		display();
	}
	
	public void print()
	{
		System.out.println("Hello");
	}
	
	private void display()
	{
		System.out.println("World");
	}
}

class B extends A
{
	public B()
	{
		
	}
	
	public void print()
	{
		System.out.println("Hi");
	}
	
	public void display()
	{
		System.out.println("Java");
	}
}

public class OverrideTest1 {
	public static void main(String[] args) 
	{		
		A a = new B();
		
		/* What will be printed?
		 * 1   - Hello World
		 * 2   - Hi Java
		 * 3   - Hello java
		 * 4   - Hi World
		 */	
	}
}