import java.util.*; 
class longarr
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n];
		int count=1,max=-1;
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			if(a[i-1]<a[i])
			{
				count++;
			}
			else
			{
				if(count>=max)
				{
					max=count;
					count=1;
				}
			}
		}
		if(count>=max)
		{
			max=count;
		}
		System.out.print(max);
		input.close();
	}
}
