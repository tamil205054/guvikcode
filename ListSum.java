
import java.util.*;
class ListSum
	{
		public static void main(String[] args) 
		{
			Scanner ip=new Scanner(System.in);
			int n=ip.nextInt();
			List<Integer> a=new ArrayList<Integer>(n);
			List<Integer> b=new ArrayList<Integer>(n);
			List<Integer> c=new ArrayList<Integer>(n);
			for(int i=0;i<n;i++)
			{
				a.add(ip.nextInt());
			}
			for(int i=0;i<n;i++)
			{
				b.add(ip.nextInt());
			}
			for(int i=0;i<n;i++)
			{
				c.add(a.get(i)+b.get(i));
					System.out.print(c.get(i));
				if(i<n-1)
				{
					System.out.print(" ");
				}
			}
		 
		}
	}
