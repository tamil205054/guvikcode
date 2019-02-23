import java.util.*;
class repeat
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int  n=input.nextInt();
      int k=input.nextInt();
      if(n<=1000000)
      {
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
          num[i]=input.nextInt();
        }
        int count=0;
        for(int  i=0;i<n;i++)
        {
          if(num[i]==k)
          {
            count++;
          }
        }
        if(count!=0)
        {
          System.out.print("Yes"+" "+count);
        }
        else
        {
          System.out.print("no");
        }
      }
  }
}
