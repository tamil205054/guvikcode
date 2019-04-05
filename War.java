import java.util.Scanner;	
class War
{
	public static void main(String str[])
	{
		 
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		
		 
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					if(i<j&&j<k&&i<k)
					{
						if(arr[i]>arr[j]&&arr[j]>arr[k]&&arr[i]>arr[k])
						{	
							count++;
						}
					}
				}	
			}
		}
		System.out.print(count);
		input.close();
		
		
	}
}
