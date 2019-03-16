
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
			int ascii=ch[i]; 
			if(ascii>=65&&ascii<=90)
			{
				System.out.print(Character.toLowerCase(ch[i]));
			}
			else if(ascii>=97&&ascii<=122)
			{
				System.out.print(Character.toUpperCase(ch[i]));
			}
		}
        ip.close();    
    }
}
