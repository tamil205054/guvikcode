    
import java.util.*;
class integer
{
  public static void main(String[] args)
  {
      Scanner input =new Scanner(System.in);
      long num=input.nextLong();
      if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE)
      {
        System.out.print("INT");
      }
      else if(num>Integer.MAX_VALUE)
      {
          System.out.println("LONG");
      }
  }
}
