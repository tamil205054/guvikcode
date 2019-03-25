import  java.util.*; 
class array
{
	public static void main (String[] args) 
	{ 
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		List<Integer> index=new ArrayList<Integer>();
		Set<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c[i]=b[i]=input.nextInt();;
		}
		Arrays.sort(b);
	 
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(c[j]==b[i])
				{
					if(hs.add(j))
					{	
					index.add(j);
					}
				}
			}
		}
		for(int i=0;i<index.size();i++)
		{
			System.out.print(a[index.get(i)]);
			if(i<index.size()-1)
			{
				System.out.print(" ");
			}
		} 
		
	}
}
