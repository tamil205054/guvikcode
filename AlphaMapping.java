import java.util.*;
public class AlphaMapping
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		String str=Integer.toString(num);
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			String s=Character.toString(str.charAt(i))+Character.toString(str.charAt(i+1));
			int n=Integer.parseInt(String.valueOf(s));
			if(n<=26 && str.charAt(i)!='0')
			{
				count+=1;
			}
		}
		if(count==3)
		{
			System.out.print(count);
		}	
		else
		{
			System.out.print(count+(int)Math.floor((count-1)/2));
		}
		input.close();
	}
}
