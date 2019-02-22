import java.util.*;
class factorial
{
  public static void main(String[] args)
  {
      Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();

      if(1<=n&&n<= 25)
      {
        int fact=1;
      for(int i=1;i<=n;i++)
      {
        fact=fact*i;
      }
      System.out.print(fact);
    }

  }
}
