import java.util.*;
public class Encoded
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String str=input.next();
		String output="";
		for(int i=0;i<str.length()-1;i++)
		{
			char ch=str.charAt(i);
			int count=0;
			String ch1="";
			for(int j=i+1;j<str.length();j++)
			{
				if(Character.isDigit(str.charAt(j)))
				{
					ch1+=Character.toString(str.charAt(j));		
					 count=Integer.parseInt(String.valueOf(ch1));
					i++;
				}
				else
				{ 
					break;
				}
			}
			// System.out.print(count);
			for(int k=0;k<count;k++)
			{
				output+=Character.toString(ch);
			}
		}
		System.out.print(output);
		input.close();
	}
}
