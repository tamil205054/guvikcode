import java.util.*;
class oddCaps
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String arrStr[]=str.split(" ");
		for(int i=0;i<arrStr.length;i++)
		{
			char  ch[]=arrStr[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				ch[j]=Character.toUpperCase(ch[j]);
				
				j++;
			}
			arrStr[i]=String.copyValueOf(ch);
			System.out.print(arrStr[i]);
			if(i<arrStr.length-1)
			{
				System.out.print(" ");
			}	
		}
	}
}
