
import java.util.*;
import java.lang.*; 
class string
{
	public static void main (String arg[])  
	{ 
		Scanner scanf=new Scanner(System.in);
		String input = scanf.next();
		for(int i=0;i<input.length();i++)
		{
			System.out.print((char)(input.charAt(i)+3));
			
		}
		
	}
}
