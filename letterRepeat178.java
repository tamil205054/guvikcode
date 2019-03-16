
import java.util.*;
class repeat
{
    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        String str=ip.nextLine();
        char ch[]=str.toCharArray(); 
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(i!=j)
				{
					if(ch[i]==ch[j])
					{
	//				 ch[i]=Character.toUpperCase(ch[i]);
		//			 ch[j]=Character.toUpperCase(ch[j]);
					str=str.replace(ch[i],Character.toUpperCase(ch[i]));
					}
				}
			} 
		} 
		System.out.print(str);
        ip.close();    
    }
}
