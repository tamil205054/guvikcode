import java.util.*; 
class Index
{
	public static void main (String[] args)
	{
		
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
				b[i]=a[i]=input.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(j+1);
					break;
				}
			}
			if(i<n-1)
			{
				System.out.print(" ");
			}
		}
		
		input.close();
	}
}	
