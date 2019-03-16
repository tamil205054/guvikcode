import java.util.*;
class hexi
{
	
    public static void main(String aa[])
	{ 
        Scanner ip=new Scanner(System.in);
		String hex=ip.next();
		int len=hex.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(hex.charAt(i)>='0' && hex.charAt(i)<='9'||hex.charAt(i)>='A' && hex.charAt(i)<='F')
			{
				count++;
			}
		}
		if(count==len)
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
