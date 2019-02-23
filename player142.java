import java.util.*;
class str
{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int k=input.nextInt();
    if(n<1000&&k<1000)
    {
      String str[]=new String[n];
      for(int i=0;i<n;i++)
      {
        str[i]=input.next();
      }
      int count=0;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(i!=j)
          {
            if(str[i]===str[j])
            {
              count++;
            }
          }
        }
      }

    if(count==k)
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
