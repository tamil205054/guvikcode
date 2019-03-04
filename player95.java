import java.util.*;
class find_digit
{
  public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int number=input.nextInt();
      int k=input.nextInt();
      int pos=input.nextInt();
      String str=Integer.toString(number);
      System.out.print(str.charAt(k+pos-1));

  }
}
