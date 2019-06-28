import java.util.*;
public class boxArray
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int flag=1;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		for (int i=1;i<n;i++) 
		{
			if(arr[i]==arr[i-1])
			{
				flag++;
			}	
		}
		System.out.print(flag);
		input.close();	
	}
}
