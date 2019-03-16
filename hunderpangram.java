import java.util.*;
class pangram
{
	 
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		Set<Character> ch=new HashSet<>();
		str=str.toLowerCase();
		str=str.replaceAll("[ \\ . , !]","");
		for(char c:str.toCharArray())
		{
			if(c>='a'&&c<='z')
			{
				ch.add(c);
			}
		} 
		if(ch.size()==26)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
