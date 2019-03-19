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
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		Arrays.sort(b);
		int sum=0,j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==b[n-1])
			{
				sum =a[i];
				j=i-1;
				break;
			}
		}
		sum += a[j];
		System.out.print(sum);
		
	}
}
