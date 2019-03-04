import java.util.*;
class Prime
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      String str=input.nextLine();
      String string[]=str.split(" ");
      int len=0;
      for(int i=0;i<string.length;i++)
      {
        len=len+string[i].length();
      }
      int flag=0;
      for(int i=2;i<len;i++)
      {
        if(len%i==0)
        {
          flag++;
        }
      }
      if (flag==0)
      {
      System.out.print("yes");
      }
      else
      {
      System.out.print("no");
      }
  }
}
