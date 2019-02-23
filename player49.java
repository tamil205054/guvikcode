import java.util.*;
class integer
{
  public static void main(String[] args)
  {
      Scanner input =new Scanner(System.in);
      int num=input.nextInt();
      if(num>=-2147483648 && num<=2147483647)
      {
        System.out.print("INT");
      }
  }
}
