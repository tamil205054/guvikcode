import java.util.*;
class ZeroNum
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arrNum[]=new int[n];
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arrNum[i]=input.nextInt();
		}
		int flag=0;
		for(int i=n-1;i>=0;i--)
		{
			if(arrNum[i]==0)
			{
				flag++;	
			}
			if(flag==1 )
			{
				if(arrNum[i]==1)
				{
					result.add(arrNum[i]);
				}	 
			}
			if(flag==2)
			{
				flag=0;
				if((i-1)!=-1)
				{
				if(arrNum[i-1]==1)
				{
					result.add(arrNum[i-1]);
				}
				}
			}
			 
		}
		for(int i=0;i<result.size();i++)
		{
		System.out.print(result.get(i));
		if(i<result.size()-1)
		{
System.out.print(" ");
		}
		} 
input.close();
	}
}
