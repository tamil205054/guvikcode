import java.util.*;
public class Apollo
{
	public static void main(String[] args) 
	{
			Scanner input=new Scanner(System.in);
			int n=input.nextInt();
			int m=input.nextInt();
			int arr1[]=new int[n];
			int arr2[]=new int[n];
			int sum1=0;
			int sum2=0;
			for (int i=0;i<n;i++) 
			{
				arr1[i]=input.nextInt();
				sum1+=arr1[i];
			}
			for (int i=0;i<n;i++) 
			{
				arr2[i]=input.nextInt();
				sum2+=arr2[i];
			}
			System.out.print((int)Math.floor((sum2+m)/sum1));
			input.close();	
	}
}
