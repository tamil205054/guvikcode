import java.util.*;
class min
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
     String str=input.next();

     StringBuilder StrBdr = new StringBuilder();
     StrBdr.append(str);
     String pali=StrBdr.reverse().toString();
     char ch[]=str.toCharArray();
     int len=ch.length;
     if(str.equals(pali))
     {
       System.out.print("yes");
     }
     else
     {
     ArrayList<Character> ans=new ArrayList<Character>();
     for(int i=0;i<len;i++)
     {
       ans.add(ch[i]);
     }
     ans.add(ch[0]);
     StringBuilder sb = new StringBuilder();
        for (Character cha : ans)
        {
            sb.append(cha);
        }
        String string = sb.toString();
        String rev=sb.reverse().toString();
        if(string.equals(rev))
        {
          System.out.print("yes");
        }
        else
        {
          System.out.print("no");
        }
     }
}
}
