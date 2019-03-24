import java.util.*;
class sortArray
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n];
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{		
			a[i]=input.nextInt();
		} 
		int count=0;
		for(int i=0;i<n;i++)
		{		 
			if(a[i]==0)
			{
				count++;
			}
			else
			{	
				result.add(a[i]);
			}
	 
		}
		for(int i=0;i<count;i++)
		{
			result.add(0);
		}
		for(int i=0;i<result.size();i++)
		{
		 	System.out.print(result.get(i));
			if(i<result.size()-1)
			{
				System.out.print(" ");
			}
		}	 	
	}
}
