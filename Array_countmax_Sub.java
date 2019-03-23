import java.util.*;
class MaxSubArray
{
	public static void main(String ar[])
	{
		Scanner input=new Scanner(System.in);	
		int n=input.nextInt();	
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{	
			arr[i]=input.nextInt();
		}
		int max=0;
		for(int i=0;i<n-1;i++)
		{
			int count=1;
			
			for(int j=i;j<n-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					count++;
				}
				else
				{
					break;	
				}
			}
			if(count>max)
			{
				max=count;
			}
		}
		System.out.print(max);
	}
}
