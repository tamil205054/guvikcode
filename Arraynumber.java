import java.util.*;
class arraynumber
{	
    public static void main(String aa[])
	{ 
        Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++)
		{
			 num[i]=ip.nextInt();
		}
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{ 
			if(i%2==0)
			{
				if(num[i]%2!=0)
				{
					result.add(num[i]);
				}
			} 
			else
			{
				if(num[i]%2==0)
				{
					result.add(num[i]);
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

		ip.close();
	}
}
