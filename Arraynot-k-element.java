import java.util.*; 
class arraypair
{
	public static void main (String[] args)
	{
		int flag=0;
		Scanner input=new Scanner(System.in);
		int n=input.nextInt(); 
		int k=input.nextInt();
		int a[]=new int[n];
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
				a[i]=input.nextInt();
		}
		int prodect;
		for(int i=0;i<n;i++)
		{
		 if(a[i]!=k)
		 {
			 result.add(a[i]);
		 }
		 
		} 
		if(result.size()>0)
		{
				for(int i=0;i<result.size();i++)
					{
						System.out.print(result.get(i));
						if(i<result.size()-1)
						{
							System.out.print(" ");
						}
					}
		}
		else
		{
			System.out.print("empty");
		}
		
 		input.close();
	}
}
