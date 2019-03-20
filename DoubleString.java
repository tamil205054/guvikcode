import java.util.*;
class Palidrome
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      String str=input.next();
     int n=str.length();
	 int flag=0;
        for(int i=0;i<n;i++)
        { 
			String pali="";
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					pali=pali+str.charAt(j);
				}
			}
			int  len=pali.length();
			String str1=pali.substring(0,len/2);
			String str2=pali.substring(len/2,len);
			 
			if(str2.equals(str1))
			{
				flag=1;
				break;
			}
        }
       if(flag==1)
	   {
		   System.out.print("YES");
	   }
	   else
	   {
		   System.out.print("NO");
	   }

  }
}
