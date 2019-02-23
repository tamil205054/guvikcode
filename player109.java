import java.util.*;
class sum
{
  public static void main(String[] args)
  {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      if(n<=100000)
      {
      int arrNum[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arrNum[i]=scan.nextInt();
      }
int sum;
      for(int j=1;j<n;j++)
      {
       sum=0;

        sum=arrNum[j-1]+arrNum[j];


      arrNum[j]=sum;
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(arrNum[i]);
      if(i<n-1)
      {
        System.out.print(" ");
      }
    }

  }
  }
}
