import java.util.*;
 
class palindrome
{
   public static void main(String args[])
   {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);
     
    original = in.next();
     
      int length = original.length();
     
      for (int i = length - 1; i >= 0; i--)
      {
         reverse += original.charAt(i);
      }  
      if (original.equals(reverse))
      {
            System.out.println("yes");
      }
      else
      {
          System.out.println("no");
      } 
   }
} 
