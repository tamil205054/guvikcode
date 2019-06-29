import java.util.*;
public class BinaryDivide64
{
	static boolean check(String str)
	{
		int count=0;
		for (int i=str.length()-1;i>=0;i--) 
		{
			if(str.charAt(i)=='0')
			{
				count++;
			}	
			if (count>=6 && str.charAt(i)=='1')
			{
				return true;	
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String str=input.next();
		if(check(str))
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}

		input.close();	
	}
}
