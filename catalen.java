import java.util.*;
class Cataln { 
	 int catalan(int n) { 
		int result = 0;  
		if (n <= 1) 
		{ 
			return 1; 
		} 
		else
		{
		for (int i = 0; i < n; i++) 
		{ 
			result = result+(catalan(i) * catalan(n - i - 1)); 
		} 
		}
		return result; 
	} 

	public static void main(String[] args) {  
		Scanner input=new Scanner(System.in);
		 Cataln cn = new Cataln(); 
		int n=input.nextInt(); 
		if(n==0)
		{
			System.out.print(1);
		}
		else{
		for (int i = 0; i < n; i++) 
		{ 
			System.out.print(cn.catalan(i));
				if(i<n-1)
				{
					System.out.print(" ");
				}
		}
		}
		input.close();
	} 
} 
