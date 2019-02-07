import java.util.*;
class compare
{
	public static void main(String args[])
	{
		Scanner SC=new Scanner(System.in);
		String str1=SC.next().toLowerCase();
		String str2=SC.next().toLowerCase();
        int len1=str1.length();
        int len2=str2.length();
        int flg=0;
		if(len1!=len2)
        {
			 if(len1 >len2)
             {
                 System.out.print(str1);
             }
             else
             {
                 System.out.print(str2);
             }
		}
		else
        {
		    for(int i=0; i<str1.length();i++)
            {
			    if(str1.charAt(i)!=str2.charAt(i))
                {
				    flg=1;
				    break;
			    }
		    }
		    if(flg==1)
            {
			System.out.println(str1);
		    }
        }
	}
}
