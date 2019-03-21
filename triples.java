 

import java.io.*; 
import java.math.*;
import java.util.*; 

class GFG { 
 

	// Driver code 
	public static void main(String args[]) 
	{ 
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		 int count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			 for(int j=i+1;j<n;j++)
			{
			
				for(int k=j+1;k<n;k++)
				{
					if(i<j&&j<k&&i<k)
					{
						if(arr[i]<arr[j]&&arr[j]<arr[k]&&arr[i]<arr[k])
						{
						count++;
						}
					}
				}
			}
		} 
		System.out.print(count);
	} 
} 

 
