package opps;

public class Object1 
{
	A a = new A(); 
	
	A getA() 
	{ 
		return a; 
	} 
	
	public static void main( String [] args) 
	{ 
		Object1 t = new Object1();
		A a = t.a; 
		t.a = null;
		
		System.out.println( a ); 
		// What will print?  null or Object1@something
	}
	
	
	class A
	{
	 
	}

}
