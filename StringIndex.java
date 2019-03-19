import java.util.*; 
class StringIndex
{
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str1=input.next(),str2=input.next();
		int flag=0; 
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str2.length()+i<=str1.length())
			{
				
			String str3=str1.substring(i,str2.length()+i);
			if(str2.equals(str3))
			{
				count=1;
				System.out.println(i);
				break;
			}			
			}
		}
		if(count==0)
		{
			System.out.print(-1);
		}
		input.close();
	}
}	
