import java.util.*;
class Luckey
{
	public static void main(String str[])
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arrNum[]=new int[n];
		for(int i=0;i<n;i++)
		{	
			arrNum[i]=input.nextInt();
		}
		int result=0;
	
	int luck;
		for(int i=0;i<n;i++)
		{	
		 luck=arrNum[i]*n;
			for(int j=0;j<n;j++)
			{
				if(luck==arrNum[j])
				{
					result=arrNum[i];	
					i=n;
					break;
					 
				}
			}
			 
		}
		System.out.print(result);
		input.close();
	}


}
