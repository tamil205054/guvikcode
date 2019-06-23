import java.util.*;
 public class Co_prime { 
	  
	static int __gcd(int a, int b) 
	{ 

		if (a == 0 || b == 0) 
		{
			return 0; 
		}
	 
		if (a == b) 
		{
			return a; 
		}
		
		if (a > b)
		{
			return __gcd(a-b, b); 
		} 		
		return __gcd(a, b-a); 
	} 
	  
	public static void main (String[] args) 
	{ 
		Scanner input=new Scanner(System.in);
		int a = input.nextInt(), b = input.nextInt(); 
		
		if ( __gcd(a, b) == 1) 
		{
			System.out.println("yes"); 
		}
		else
		{
			System.out.println("no"); 
		}
		input.close();
	} 
} 

 
