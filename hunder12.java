  import java.util.*;
class high
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int k=input.nextInt();
      if(n<=100000&&k<=100000&&k<=n)
      {
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=input.nextInt();
        }
          Arrays.sort(arr);
          System.out.print(arr[n-k]);
      }
  }
}
