import java.util.*; 
class arraypair
{
	public static void main (String[] args)
	{
		int flag=0;
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int k=input.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
				a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
			if(i!=j)
			{
				int sum=0;
				sum=a[i]+a[j];
					if(sum==k)
					{
					flag=1;
					i=n;
					break;
					
					}
					 
			}
			}
		}
		if(flag==1)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		input.close();
	}
}
