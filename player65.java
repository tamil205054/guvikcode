import java.util.*;
class arrayprint
{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=input.nextInt();
    }
    for(int j=0;j<n;j++)
    {
      if(n>arr[j])
      {
        System.out.printf("%s ",arr[j]);
      }
    }
  }
}
