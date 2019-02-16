import java.util.*;
class bignumber
	{
	public static void main(String ar[])
		{
		Scanner input=new Scanner(System.in);
		String str=input.next();
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
			for(int i=ch.length-1;i>=0;i--)
			{
		System.out.print(ch[i]);	 
			}
		}
	}
