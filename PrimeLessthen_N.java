import java.util.*;
class oddCaps
{
	 
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		ArrayList<Integer> re=new ArrayList<Integer>();
		for(int i=2;i<n;i++)
		{
			int flag=0;
				for(int j=2;j<i;j++)
				{
					 
					
					if(i%j==0)
					{
						flag++;
					}
				 
				}
				if(flag==0)
				{
					re.add(i);
				}
		}
			if(re.size()>0)
			{
				for(int i=0;i<re.size();i++)
					{	
						System.out.print(re.get(i));
						if(i<re.size()-1)
						{
							System.out.print(" ");
						}
			
					}
			}
			else
			{
				System.out.print(0);
			}
	}
}
