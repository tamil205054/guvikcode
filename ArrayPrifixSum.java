import  java.util.*; 
class array
{
	public static void main (String[] args) 
	{ 
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n];  		
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		int flag=0;
		for(int i=1;i<n;i++)
		{
			int sum1=0;
			int sum2=0;
			for(int j=0;j<i;j++)
			{
				sum1+=a[j];
			}
			for(int k=i;k<n-1;k++)
			{
				sum2+=a[k+1];
			}
			if(sum1==sum2)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}			
	}
}
