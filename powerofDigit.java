import java.util.*;

class PowerOfSum{ 
	static int power(int digit,int n)
	{
		int p=1;
		for(int i=1;i<=n;i++)
		{
			p=p*digit;
		}
		return p;
	}
	public static void main(String[] args) {  
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		char num[]=Integer.toString(number).toCharArray();
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			int digit=Character.getNumericValue(num[i]);
			sum=sum+power(digit,i);
		} 
		System.out.print(sum);
		input.close();
		
	} 
} 
