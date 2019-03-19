 
import java.io.*;
import java.util.*; 

class SubArray{  
	 
	 
	public static void main (String[] args) 
	{  
		Scanner input=new Scanner(System.in);
		int n =input.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
	 	int minVal = arr[0]; 
		int maxVal = arr[0]; 
	
		int maxProduct = arr[0]; 
	
		for (int i = 1; i < n; i++) 
		{ 
			if (arr[i] < 0) 
			{ 
				int temp = maxVal; 
				maxVal = minVal; 
				minVal =temp; 
			
			}  
			maxVal = Math.max(arr[i], maxVal * arr[i]); 
			minVal = Math.min(arr[i], minVal * arr[i]); 	 
			maxProduct = Math.max(maxProduct, maxVal); 
		} 
		System.out.print(maxProduct);
	} 
} 
 
  
