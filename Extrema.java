import java.io.*; 
import java.util.*;
public class Extrema { 
	
	static int extrema(int a[], int n) 
	{ 
		int count = 0; 
		if(n==1)
		{
		count=1;
		}
		else
		{
		int flag=0; 
		for (int i = 0; i < n ; i++) 
		{
	 		if(i==0)
	 		{
	 			if(a[i]!=a[i+1])
	 			{
	 				count++;
	 			}
	 		}
	 		else if(i==n-1)
	 		{
	 			if(a[i]!=a[i-1])
	 			{
	 				count++;
	 			}	
	 		}
	 		else
	 		{
				if(a[i] > a[i - 1] && a[i] > a[i + 1]||a[i] < a[i - 1] && a[i] < a[i + 1]) 
				{
					count++;
		 		} 
		 	} 
		} 
		}
		return count; 
	} 
	
	 
	public static void main(String args[]) 
							 
	{ 
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=input.nextInt();				
		}
		System.out.println(extrema(a, n)); 
	} 
} 

 
