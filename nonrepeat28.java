
import java.util.*;
class Camelcase
{
    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        String str=ip.next();
		 HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			char ch[]=str.toCharArray();
			if(hs.add(ch[i]))
			{
				System.out.print(ch[i]);
			}
		} 
	 
        ip.close();    
    }
}
