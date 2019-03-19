import  java.util.*;
class array
{
    public static  void main(String arg[])
    {
        Scanner input=new Scanner(System.in); 
		String str=input.next(); 
		String str1="dhoni";
		char ch1[]=str.toCharArray();
		char ch2[]=str1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		int count=0;
		for(int i=0;i<ch1.length;i++)
		{ 
			if(ch1[i]==ch2[i])
			{
				count++;
			}
		}
		 
		if(count==5)
		{
			System.out.print("YES");
		}
		
	}
}
