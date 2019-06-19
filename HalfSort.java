import java.util.*;
public class HalfSort
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int mid=0;
		if(n%2==0)
		{
			mid=n/2;
		}
		else
		{
			mid=(n-1)/2;
		}
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=input.nextInt();	
		}
		for(int i=0;i<mid-1;i++)
		{
			for (int j=0;j<mid-1;j++ ) 
			{
				if(a[j]>a[j+1])
				{
            		int temp=a[j+1];
                	a[j+1]=a[j];
                	a[j]=temp;
            	}	
			}
		}

		for(int i=mid;i<n-1;i++)
		{
			for (int j=mid;j<n-1;j++ ) 
			{
				if(a[j]<a[j+1])
				{
            		int temp=a[j+1];
                	a[j+1]=a[j];
                	a[j]=temp;
            	}	
			}
		}

		for (int i=0;i<n;i++)
		{
			System.out.print(a[i]);
			if(i<n-1)
			{
				System.out.print(" ");
			}	
		}
		input.close();	
	}
}
