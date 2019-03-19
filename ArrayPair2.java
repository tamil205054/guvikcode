import java.util.*; 
class arraypair
{
	public static void main (String[] args)
	{
		int flag=0;
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
				a[i]=input.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j]&&i<j)
				{
					flag++;
				}
			}
		}
		System.out.println(flag);
		input.close();
	}
}
