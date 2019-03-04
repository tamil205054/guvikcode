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
        for(int j=0;j<n;j++)
        {
          int count=0;
          for(int i=0;i<n;i++)
          {
              if(arr1[i]%arr1[j]==0)
              {
                  ++count;
              }
          }
          // System.out.print(count);
          if(count==n)
          {
            System.out.println(arr1[j]);
            j=n;
          }
        }
      }
  }
}
