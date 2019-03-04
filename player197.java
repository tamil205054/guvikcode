import java.util.*;
class min
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int array[]=new int[n];
    int minmum=0;
    int flag=n+n;
      for(int i=0;i<n;i++)
      {
        array[i]=input.nextInt();
      }
     Arrays.sort(array);
      System.out.print(array[n-1]-array[0]);
  }
}
