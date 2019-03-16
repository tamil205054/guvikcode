
import java.util.*;
class caseChange
{
    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        String str=ip.next();
		char ch[]=str.toCharArray();  
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(i!=j)
				{
					if(ch[i]==ch[j])
					{
						count++;
					}
				}
			}
			if(count==0)
			{
		
		System.out.print(ch[i]);		 
			}
		} 
        ip.close();    
    }
}
