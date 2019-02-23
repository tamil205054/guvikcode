import java.util.*;
class delete
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int k=input.nextInt();
    if(k<=100000)
    {
      int arrNum[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arrNum[i]=input.nextInt();
      }
      for(int i=0;i<n-k;i++)
      {
          System.out.print(arrNum[i]);
          if(i<n-k-1)
          {
            System.out.print(" ");
          }
      } 
    }
  }
}
