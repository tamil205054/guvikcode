import java.util.*;
class even
{
  public static void main(String[] args)
  {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n<=100000)
      {
        int arr1[]=new int[n];
        int prodect=1;
        for(int i=0;i<n;i++)
        {
          arr1[i]=in.nextInt();
          prodect*=arr1[i];
        }
        if(prodect%2==0)
        {
          System.out.print("even");
        }
        else
        {
          System.out.print("odd");
        }
      }
    }
  }
