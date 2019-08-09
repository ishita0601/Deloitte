package testing;
import java.util.*;

public class Numbers {

	public static void main(String[] args) 
	{
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("get the numbers");
		a=sc.nextInt();
		System.out.println("a = "+ a);
		b=sc.nextInt();
		System.out.println("b = "+ b);
		if(a+b>=0)
		{
			System.out.println("postive");
		}
		else
		{
			System.out.println("negative");
		}
	
		sc.close();
	}
	
	

}
