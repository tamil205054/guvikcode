import java.util.*;
public class R-char
{
	static int Count(String str)
	{
		int max=0;
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			if(max<count)
			{
				max=count;
			}
		}
		return max;
	}
	static boolean Check(String str,int max,char ch)
	{

		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				count++;
			}
		} 		
		if(count==max)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		str=str.replaceAll("\\s+","");
		int max=Count(str);
		List<Character> output=new ArrayList<Character>();
		Set<Character>non=new HashSet<>();
		for(int i=0;i<str.length();i++)
		{ 
			if(non.add(str.charAt(i)))
			{
				if(Check(str,max,str.charAt(i)))
				{
					output.add(str.charAt(i));
				}
			}
		}
		System.out.print(max+" ");
		for (int i=0;i<output.size();i++) 
		{
			System.out.print(output.get(i));	
		}
		input.close();	
	}
}
