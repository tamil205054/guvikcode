import java.io.*;
import java.util.*; 
class subarray
{ 
static int countEvenSum(int arr[], int n) 
{ 
	int result = 0;  
	for (int i = 0; i <n ; i++) 
	{   
		for (int j = i; j < n; j++) 
		{ 
			result++; 
		} 
	} 

	return (result); 
} 

 
public static void main (String[] args) 
{ 
Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n]; 
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
  
System.out.println(countEvenSum(arr, n)); 
} 
}   
