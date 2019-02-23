import java.util.*;
class rightshift
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int k=input.nextInt();
      if(n<=100000&&k<=100000)
      {
        int num=n>>k;
        //double val=Math.round(num*100.0)/100.0;
        System.out.print(num);
      }

  }
}
