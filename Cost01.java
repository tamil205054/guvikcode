import java.util.*;
public class Cost01
{
	public static void main(String args[])
	{	
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		String str2=input.next();
		int sum=0;
		if(str1.length()>str2.length())
		{
			String temp=str1;
			str1=str2;
			str2=temp;
		}	
		int i=0;
		while(i<str1.length())
		{
			sum+=((int)str2.charAt(i)-(int)str1.charAt(i));
			i++;
		}
		for(int j=i;j<str2.length();j++)
		{
		    sum+=((int)str2.charAt(j)-(int)'a')+1;
		}
		System.out.println(sum);
	}
}
