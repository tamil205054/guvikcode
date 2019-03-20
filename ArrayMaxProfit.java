import  java.util.*; 
class array
{
	public static void main (String[] args) 
	{ 
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n];
		 
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
	 
		Arrays.sort(a);
	 
		System.out.print(a[n-1]-a[0]);
		
	}
}
