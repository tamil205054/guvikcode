import java.util.*;
class Matrix
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int matrix[][]=new int[n][n];
      int d1=1,d2=1;
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          matrix[i][j]=input.nextInt();
        }
      }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          if(i==j)
          {
            d1*=matrix[i][j];
          }
          if(i==n-j-1)
          {
          d2*=matrix[i][j];
          }
        }
      }
      System.out.print(d1+d2);
  }
}
