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
			String rev="";
			String pali="";
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					pali=pali+str.charAt(j);
				}
			}
			for(int k=pali.length()-1;k>=0;k--)
			{
				rev=rev+pali.charAt(k);
			}
			if(rev.equals(pali))
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
