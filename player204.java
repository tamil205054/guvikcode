import java.util.*;
class sumofarray
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      if(n<=100000)
      {
        int arrNum[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
          arrNum[i]=input.nextInt();
          if(arrNum[i]<1)
          {
          sum=sum+arrNum[i];
          }
        }
        System.out.print(sum);
      }
  }
}
