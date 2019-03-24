  import java.util.*;
class sortArray
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		String str2=input.next();
		List<Character> char1=new ArrayList<Character>();
		List<Character> char2=new ArrayList<Character>();
		Set<Character> ch1=new HashSet<Character>();		
		Set<Character> ch2=new HashSet<Character>();
		int count=0;
		for(int i=0;i<str1.length();i++)
		{		
			char c=str1.charAt(i);
			if(ch1.add(c))
			{
				char1.add(c);
			}
		}
		for(int i=0;i<str2.length();i++)
		{		
			char c=str2.charAt(i);
			if(ch2.add(c))
			{
				char2.add(c);
			}
		}   
		for(int i=0;i<char1.size();i++)
		{		 
			for(int j=0;j<char2.size();j++)
			{		 
				if(char1.get(i)==char2.get(j))
				{
					count++;
				}	 
			}	 
		}
	 		if(char1.size()==char2.size()&&count==char2.size())
			{
				System.out.print("true");
			}	 	
			else
			{
				System.out.print("false");
			}
	}
}
