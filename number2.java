import java.util.*;
class number2
{
public static void main(String arp[])
{
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int count=0;
	for(int i=1;i<=n;i++)
	{
		String str=Integer.toString(i);
		char ch[]=str.toCharArray();
		for(int j=0;j<ch.length;j++)
		{
			if(ch[j]=='2')
			{
				count++;
			}
		}
	}
	System.out.print(count);
}
}
