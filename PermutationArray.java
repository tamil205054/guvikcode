import java.util.*;
public class PermutationArray
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}	
		String output="";
		for(int i=1;i<n;i++)
		{
			if(arr[i]-arr[i-1]==1)
			{
				output="yes";
			}
			else
			{
				output="no";
			}
		}
		System.out.print(output);
	}
}
