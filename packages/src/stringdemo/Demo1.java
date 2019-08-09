package stringdemo;

class Employee
{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize function called");
		//super.finalize();
	}
}

public class Demo1 
{
	public static void main(String[] args)
	{
		String name ="Harish";
		String name1 = new String("Riya");
		name = "Riya";
		System.out.println(name.concat(" Sharma"));
		System.out.println(name);
		
		System.out.println(name.substring(2,4));
		System.out.println(name);
		System.out.println(name.equals(name1)); //comparing values
		System.out.println(name==name1); //comparing reference
		System.out.println(name.endsWith("a"));
		System.gc();
		StringBuffer la = new StringBuffer("you");
		System.out.println(name.length());
		System.out.println(la.length());
		System.out.println(la.capacity());
	}

}


