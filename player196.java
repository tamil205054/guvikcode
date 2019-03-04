import java.util.*;
class Least
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
      for(int i=0;i<n;i++)
      {
        int count=0;
        for(int j=0;j<n;j++)
        {
          if(array[i]==array[j])
          {
            count++;
          }
        }
        if(count>0)
        {
          if(count<flag)
          {
            flag=count;
            minmum=array[i];
          }
        }
      }
      System.out.print(minmum);
  }
}
