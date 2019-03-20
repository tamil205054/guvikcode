import java.util.Scanner;
 class A
{
	public static int[] longestsigns(int[] a,int n)
	{
		int[] count=new int[n];
		count[n-1]=1;
		for(int i=n-2;i>=0;i--)
		{
			if(a[i]*a[i+1]<=0)
			{
				count[i]=count[i+1]+1;
			}
			else
			{
				count[i]=1;
			}
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		     a[i]=sc.nextInt();
		}
		int[] res=longestsigns(a,n);
		for(int i=0;i<n;i++)
		{
		     System.out.print(res[i]);
			 if(i<n-1)
			 {
			System.out.print(" ")	; 
			 }
		}
		sc.close();
	}
}
