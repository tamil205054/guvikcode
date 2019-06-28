import java.util.*;
public class DiffString1
{ 
	public static boolean check(String str) 
	{ 
		if (str == null || str.equals("")) { 
			return false; 
		} 
		for (int i = 0; i < str.length(); i++) { 
			char ch = str.charAt(i); 
          if(!Character.isWhitespace(ch))
          {
			if ((!(ch >= 'A' && ch <= 'Z')) && (!(ch >= 'a' && ch <= 'z'))) 
			{ 
				return false; 
			} 
          }
		} 
		return true; 
	}
	static boolean arrayContains(String arr[],String str)
	{
		boolean result = true;
		for(int i=0;i<arr.length;i++)
		{
			if(str.equals(arr[i]))
			{
				result= false; 
			}
		}
		 return result;
	}
// 	static boolean number()
// 	{
// result true;
// 	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String str1=input.nextLine();
		String str2=input.nextLine();
		if(check(str1)&&check(str2))
		{
			String words1[]=str1.split("\\s");
			String words2[]=str2.split("\\s"); 
			List<String>out1=new ArrayList<String>(); 
			List<String>out2=new ArrayList<String>(); 

			for(int i=0;i<words1.length;i++)
			{ 
				 if(arrayContains(words2,words1[i]))
				 {
				 	out1.add(words1[i]);
				 }
			}
			for(int i=0;i<words2.length;i++)
			{
			
				 if(arrayContains(words1,words2[i]))
				 {
				 	out2.add(words2[i]);
				 }
			}

			if(out2.size()>0)
			{
				System.out.print("1:");
				for(int i=0;i<out2.size();i++)
				{
					System.out.print(out2.get(i));
					if(i<out2.size()-1)
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			if(out1.size()>0)
			{
				System.out.print("2:");
				for(int i=0;i<out1.size();i++)
				{
					System.out.print(out1.get(i));
					if(i<out1.size()-1)
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			// System.out.print(out);
		}
		else
		{
			Set<Character>s1=new HashSet<>();
			List<Character>s2=new ArrayList<>();
			Set<Character>s3=new HashSet<>();
			List<Character>s4=new ArrayList<>();		 
			for(int i=0;i<str1.length();i++)
			{
				int count=0;
				for(int k=0;k<str1.length();k++)
				{
					if(i!=k)
					{
						if(str1.charAt(i)==str1.charAt(k))
						{
							count++;
						}
					}
				}
				int flag=0;
				for(int j=0;j<str2.length();j++)
				{
				 	if(str1.charAt(i)==str2.charAt(j))
				 	{
				 		flag++;
				 	}
				}
				if(flag==count)
				{
					if(s1.add(str1.charAt(i)))
					{
						s2.add(str1.charAt(i));
					}
				}
			}
			for(int i=0;i<str2.length();i++)
			{
				int count=0;
				for(int k=0;k<str2.length();k++)
				{
					if(i!=k)
					{
						if(str2.charAt(i)==str2.charAt(k))
						{
							count++;
						}
					}
				}
				int flag=0;
				for(int j=0;j<str1.length();j++)
				{
				 	if(str2.charAt(i)==str1.charAt(j))
				 	{
				 		flag++;
				 	}
				}
				if(flag==count)
				{
					if(s3.add(str2.charAt(i)))
					{
						s4.add(str2.charAt(i));
					}
				}
			}
			if(s4.size()>0)
			{
				System.out.print("1:");
				for(int i=0;i<s4.size();i++)
				{
					System.out.print(s4.get(i));
					if(i<s4.size()-1)
						{
						System.out.print(" ");
					}
				}
				System.out.println();
			}

			if(s2.size()>0)
			{
				System.out.print("2:");
				for(int i=0;i<s2.size();i++)
				{
					System.out.print(s2.get(i));
					if(i<s2.size()-1)
						{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}			
	}
}
