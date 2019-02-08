import java.util.*;
 
class vowels
{
   public static void main(String args[])
   {
      String str;
      Scanner in = new Scanner(System.in);
      str = in.next().toLowerCase();
     
      int length = str.length(),count=0;
     
      for (int i = length - 1; i >= 0; i--)
      {
         char ch=str.charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
         {
             count=1;
         }
      }  
      if (count==1)
      {
            System.out.println("yes");
      }
      else
      {
          System.out.println("no");
      } 
   }
} 
