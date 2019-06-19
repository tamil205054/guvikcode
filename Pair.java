import  java.util.*;
public class Pair
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arrNum[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arrNum[i]=input.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			 int sum=0;
			 for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					if(i<j&&j<k&&i<k)
					{
					 sum=arrNum[i]+arrNum[j];
						if(sum==arrNum[k])
						{
							//System.out.println(arrNum[i]+"+"+arrNum[i+1]+"="+sum);
							count++;
						}
					}	 
				}
			}
	
			
		}
		System.out.print(count);
	}
}
