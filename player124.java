import java.util.*;
class smallest
{
  public static void main(String[] args)
  {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n<=100000)
      {
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr1[i]=in.nextInt();
        }
        int result=0;
        for(int j=1;j<=100000;j++)
        {
          int count=0;
          for(int i=0;i<n;i++)
          {
              if(j%arr1[i]==0)
              {
                  count++;
              }
              else
              {
                break;
              }
          }
          if(count==n)
          {
            System.out.println(j);
            break;
          }
        }
      }
  }
}
