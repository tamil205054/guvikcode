import java.util.*;
class reverse
	{
		public static void main(String ar[])
		{
			Scanner input=new Scanner(System.in);
			String str=input.next();
			char ch[]=str.toCharArray();
			int len=ch.length;
			for(int i=len-1;i>=0;i--)
			{
			System.out.print(ch[i]);
				if(i>0)
				{
					System.out.print("-");
				}
			}
			
		}
	}
