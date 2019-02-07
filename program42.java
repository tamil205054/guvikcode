import java.util.*;
class compare
{
	public static void main(String args[])
	{
		Scanner SC=new Scanner(System.in);
		String str1=SC.nextLine().toLowerCase();
		String str2=SC.nextLine().toLowerCase();
        int len1=str1.length();
        int len2=str2.length();
        boolean flg=true;
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
		    for(int loop=0; loop<str1.length();loop++)
            {
			    if(str1.charAt(loop)!=str2.charAt(loop))
                {
				    flg=false;
				    break;
			    }
		    }
		    if(flg)
            {
			System.out.println(str1);
		    }
        }
	}
}
