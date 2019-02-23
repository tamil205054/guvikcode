import java.util.*;
class diff
{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    if(n<=100000)
    {
      int arr[]=new int[n];
      for (int i=0;i<n;i++)
      {
          arr[i]=input.nextInt();
      }
      Arrays.sort(arr);
      System.out.print(arr[1]-arr[0]);
    }
  }
}
