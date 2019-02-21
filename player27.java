import java.util.*;
class caseChange
{
   public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      String  str=input.next();
      char ch[]=str.toCharArray();
    int ch1[]=new int[ch.length];
      for(int i=0;i<ch.length;i++)
      {
          ch1[i]= ch[i];
          if(ch1[i]>96)
          {
          for(int j=97;j<123;j++)
          {
            if(ch1[i]==j)
            {
                System.out.print(Character.toUpperCase(ch[i]));
                j=123;
            }
          }
        }
          else
          {
          System.out.print(Character.toLowerCase(ch[i]));
          }
      }
  }
}
