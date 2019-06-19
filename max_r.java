import java.util.*;
 public class max_r 
{
	static int Count(int arr[],int n)
	{
		int max=0;
	
		for(int i=0;i<n;i++)
		{ 
			int count=0;
			for(int j=0;j<n;j++)
			{ 	
				if(arr[i]==arr[j])
					{
						count++;
					} 
			}
			if(max<count)
			{
				max=count;
			}
		}
		return  max;
	}

	static boolean Check(int arr[],int number,int n,int index)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[index]==arr[i])
			{
				count++;
			}
		}
		if(count==number)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		List<Integer> output=new ArrayList<Integer>();
		int max=Count(arr,n); 
		for(int i=max;i>0;i--)
		{
			List<Integer> temp=new ArrayList<Integer>();

		Set<Integer>non=new HashSet<>();
			for(int j=0;j<n;j++)
			{
				if(Check(arr,i,n,j))
				{
					if(non.add(arr[j]))
					{
						temp.add(arr[j]);
					}
				}
			}
			Collections.sort(temp, Collections.reverseOrder());
			for(int k=0;k<temp.size();k++)
			{
				output.add(temp.get(k));
			}
		 }
		 for(int i=0;i<output.size();i++)
		 {
		 	System.out.print(output.get(i));
		 	if(i<output.size()-1)
		 	{
		 		System.out.print(" ");
		 	}
		 }
		input.close();	
	}
}
