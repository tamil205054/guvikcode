import  java.util.*; 
class array
{
	public static void main (String[] args) 
	{ 
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int r=input.nextInt();
		int a[]=new int[n];
		List<Integer>result=new ArrayList<Integer>(); 		
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		int max=n-r; 
			if(max>0)
			{
			for(int j=r;j<n;j++)
			{
				result.add(a[j]);
				max--;
			}
			}
			
			if(max==0)
			{ 
				for(int k=0;k<r;k++)
				{	
					result.add(a[k]);
				}
			}
	for(int j=0;j<result.size();j++)
	{
		System.out.print(result.get(j));
		if(j<result.size()-1)
		{
			System.out.print(" ");
		}
	}
		
	}
}
