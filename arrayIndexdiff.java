import java.util.*;
class sortArray
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n];
		
		int small_index=0,max_index=0;
		for(int i=0;i<n;i++)
		{		
			a[i]=input.nextInt();
		 
		}
		int small=a[0],high=a[0];
		for(int i=0;i<n;i++)
		{		 
			if(small>a[i])
			{
				small=a[i];
				small_index=i;
			}
			if(high<a[i])
			{
				high=a[i];
				max_index=i;
			}
		}
		 System.out.println(max_index-small_index);	 	
	}
}
