import java.util.*;
class Array
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long p=in.nextLong();
		long q=in.nextLong();
		long r=in.nextLong();
		long arrNum[]=new long[n];
		long max=Long.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			arrNum[i]=in.nextLong();
		}
		for(int i=0;i<n;i++)
		{	
			
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					long sum=0;
					if(i<=j&&j<=k&&i<=k)
					{
						sum=sum+(p*arrNum[i]+q*arrNum[j]+r*arrNum[k]);
					}
					if(max<=sum)
					{
						max=sum;	
					}
				 
				}
			}		
		}
		System.out.print(max);
	}
}
