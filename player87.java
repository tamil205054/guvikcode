import java.util.*;
class leftshift
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int k=input.nextInt();
      if(n<=100000&&k<=100000)
      {
        System.out.print(n<<k);
      }

  }
}
