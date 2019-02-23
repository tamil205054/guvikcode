import java.util.*;
class string
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      String str=input.next();
      int len=str.length(),count=0;
      for(int i=0;i<len;i++)
      {
        int ch=str.charAt(i);
        if(ch=='a'||ch=='b')
        {
          count++;
        }
      }
      if(len==count)
      {
        System.out.print("yes");
      }
      else
      {
        System.out.print("no");
      }
  }
}
