import java.util.*;
 public class DeviseSort{ 
	  
	  
	public static void main (String[] args) 
	{ 
		Scanner input=new Scanner(System.in);
		int n = input.nextInt(), b = input.nextInt(); 
		int arr[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
		 	arr[i]=input.nextInt();
		 }
		 Arrays.sort(arr);
		 for(int i=0;i<n;i++)
		 {
		 	System.out.print(arr[i]);
		 	if(i<n-1)
		 	{
		 		System.out.print(" ");
		 	}
		 }
		input.close();
	} 
} 

 
