import java.util.*; 
class arraypair
{
	public static void main (String[] args)
	{
		int flag=0;
		Scanner input=new Scanner(System.in);
		int n=input.nextInt(); 
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
				a[i]=input.nextInt();
		}
		int prodect;
		for(int i=0;i<n;i++)
		{
			 prodect=1;
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					prodect=prodect*a[j];
				}
			}
			b[i]=prodect;
		 
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]);
			if(i<n-1)
			{
				System.out.print(" ");
			}
		}
		
 		input.close();
	}
}
