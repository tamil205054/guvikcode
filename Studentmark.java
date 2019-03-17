  
import java.util.*;
class ListSum
	{
		public static void main(String[] args) 
		{
			Scanner ip=new Scanner(System.in);
			 
			List<String> a=new ArrayList<String>(2);
			for(int i=0;i<2;i++)
			{
				a.add(ip.next());
			} 
			int first=0;
			String result="";
			for(int i=0;i<2;i++)
			{
				String str=a.get(i);
				String st[]=str.split("#",4);
				int mark=0;
				for(int j=1;j<st.length;j++)
				{
					 mark =mark+Integer.parseInt(st[j]);
					 if(first<mark)
					 {
						 first=mark;
						 result=st[0];
					 }
				}
			}
			System.out.print(result);
			ip.close();
		}
	} 	
