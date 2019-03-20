import java.util.Scanner;

 class Long
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n];
	   
		int list[]=new int[n];
		int max=0,k=0;
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			list[i]=1;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]<a[i] && list[i]<list[j]+1)
				{
					list[i]=list[j]+1;
					
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(max<list[i])
			{
				max=list[i];
			}
		}
		System.out.print(max);
		input.close();
	}
}
