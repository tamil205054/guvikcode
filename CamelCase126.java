
import java.util.*;
class Camelcase
{
    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        String str=ip.nextLine();
		String arrStr[]=str.split(" ");
		int count=0;
		for(int i=0;i<arrStr.length;i++)
		{
			char ch[]=arrStr[i].toCharArray();
			int ascii=ch[0];
			if(ascii>=65&&ascii<=90)
			{
				count++;
			}
		} 
		if(count==arrStr.length)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
        ip.close();    
    }
}
