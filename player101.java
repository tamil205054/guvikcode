import java.util.*;
class sum
{
  public static void main(String[] args)
  {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n<=100000)
      {
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=in.nextInt();
        }
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
              {
                  sum=sum+arr[i];
              }
            else
              {
                  sum=sum+arr[i+1];
              }
        }
        System.out.print(sum);
      }
  }
}
