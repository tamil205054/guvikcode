import java.util.*;
class substring
{
  public static void main(String args[])
  {
      Scanner input=new Scanner(System.in);
      String str=input.next();
      String substr=input.next();
      if(str.contains(substr))
      {
          System.out.println("yes");
      }
      else
      {
          System.out.println("no");
      }
  }
}
