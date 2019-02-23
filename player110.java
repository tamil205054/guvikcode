import java.util.*;
class sumofarray
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
      int sum=0;

       for(int i=0;i<n;i++)
       {
        sum=sum+arrNum[i];
      }
for(int i=0;i<n;i++)
{
  arrNum[i]=sum+arrNum[i];
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
      
      
