import java.util.*; 
class arraypair
{
	public static void main (String[] args)
	{
		int flag=0;
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		List<Integer> result=new ArrayList<Integer>();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
				a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
						count++;
				}
			}
			if(count==(n-(i+1)))
			{
				result.add(a[i]);
			}
		}
		Arrays.sort(a);
		for(int i=0;i<result.size();i++)
		{
			System.out.print(result.get(i));
			if(i<result.size()-1)
			{
				System.out.print(" ");
			}
		}
		
		System.out.print("\n"+a[n-1]);
		input.close();
	}
}
