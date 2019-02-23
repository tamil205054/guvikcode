import java.util.*;
class array
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      if(n<=100000)
      {
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr1[i]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
          arr2[i]=input.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
          if(arr1[i]==arr2[n-1-i])
          {
            count++;
          }
        }
        if(count==n)
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
