import java.util.Scanner;
class string
{
  public static void main(String[] args)
  {
	   Scanner in=new Scanner(System.in);
	       String str1=in.next().toLowerCase();
         String str2=in.next().toLowerCase();
         String out="";
         char c[]=str1.toCharArray();
         char c1[]=str2.toCharArray();
         for(int i=0;i<str1.length();i++)
         {
    	     int ascii=((c[i])-96+(c1[i])-96)+96;
            if(ascii>122)
            {
              ascii=(ascii-122)+96;
            }
            char ch=(char)ascii;
            out=out+ch;
       }
     System.out.println(out);
  }
}
