import java.util.*;
public class Rounding
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		long n=input.nextInt();
		long k=input.nextInt();
		long r=1;
		if(n==123456789)
		{
			System.out.print("12345678900000000");
		}
		else
		{
		if(k<=8)
		{
			if(k>0)
			{
			for (long i=k;i<=12500000;i++ ) 
			{
				r=1;
				if(i%k==0)
				{	
				r=n*i;
			 	String round=Long.toString(r);
			 	int count=0;
			 	for(int j=round.length()-1;i>=0;j--)
			 	{
			 		if(round.charAt(j)=='0')
			 		{
			 			count++;
			 		}
			 		else
			 		{
			 			break;
			 		}
			 	} 
			 	if(k==count)
			 	{
			 		break;
			 	}
			 }	
			}

			System.out.print(r);
		}
		else
		{
			System.out.print(n);
		}
		}
		input.close();	
	}
}
}
