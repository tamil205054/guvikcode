import java.util.*;
class StringMix
{
	
    public static void main(String[] args) 
	{
    	Scanner input = new Scanner(System.in);
		String str1=input.next();
		String str2=input.next();
		int len1=str1.length();
		int len2=str2.length();
		int max=Math.max(len1,len2);
		int j=0;
		int st1=0,st2=0;
		int num1=1,num2=1;
		for(int i=0;i<max+max;i++)
		{
			if(j%2==0)
			{
				if(len1>0)
				{
					System.out.print(str1.charAt(st1));
					st1++;
					len1--;
				}
				else
				{
					System.out.print(num1);
					num1++;
				}
			}
			else{
				if(len2>0)
				{
					System.out.print(str2.charAt(st2));
					st2++;
					len2--;
				}
				else
				{
					System.out.print(num2);
					num2++;
				}
			}
			j++;
		}
		input.close();
	}
}
