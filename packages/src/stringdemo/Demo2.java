package stringdemo;

import java.util.StringTokenizer; 
public class Demo2 
{
	public static void main(String[] args)
	{
		String quote = "hello:happy:birthday";
		StringTokenizer tokenizer = new StringTokenizer(quote,":");
		
		System.out.println(tokenizer.countTokens());
		
		while(tokenizer.hasMoreTokens())
		{
			System.out.println(tokenizer.nextToken());
		}
	}
}
