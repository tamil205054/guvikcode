import java.util.*;
class Vowels
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      if(n<= 1000)
      {
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
          str[i]=input.next();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
          char ch[]=str[i].toCharArray();
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
            count++;
          }
        }
        if(count==n)
        {
          System.out.print("yes");
        }
        else {
          System.out.print("no");
        }
      }
  }
}
