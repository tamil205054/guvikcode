import java.util.*;
class coprime { 
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
	static void coprime(int a, int b) 
	{ 
		
		if ( __gcd(a, b) == 1)
		{ 
			System.out.println("yes"); 
		}
		else
		{
			System.out.println("no");	 
		}
	} 
	 
	public static void main (String[] args) 
	{ 
		Scanner input=new Scanner(System.in);
		String str1=input.next(),str2=input.next();
		int a = str1.length(), b = str2.length(); 
		coprime(a, b); 
	} 
} 

// This code is contributed by Anant Agarwal. 
