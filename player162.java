import java.util.*;
class Vowels
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int k=input.nextInt();
      if(n<= 1000&&k<=1000)
      {
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
          str[i]=input.next();
        }
          char ch[]=str[k-1].toCharArray();
          int flag=0;
          for(int j=0;j<ch.length;j++)
          {
            if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
            {
              flag=1;
            }
          }

        if(flag==1)
        {
          System.out.print("yes");
        }
        else {
          System.out.print("no");
        }
      }
  }
}
