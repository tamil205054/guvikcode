  import java.util.*;
class Cataln { 
	static int catalan(int n) { 
		int result = 0;  
		if (n <= 1) 
		{ 
			return 1; 
		} 
		for (int i = 0; i < n; i++) 
		{ 
			result = result+(catalan(i) * catalan(n - i - 1)); 
		} 
		return result; 
	} 

	public static void main(String[] args) {  
		Scanner input=new Scanner(System.in);
		int n=input.nextInt(); 
		for (int i = 0; i < n; i++) 
		{ 
			System.out.print(catalan(i));
				if(i<n-1)
				{
					System.out.print(" ");
				}
		}
		input.close();
	} 
} 
