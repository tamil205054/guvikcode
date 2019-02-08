import java.util.*;
 
class find
{
   public static void main(String args[])
   {
      int num,start,end;
      Scanner in = new Scanner(System.in);
      num = in.nextInt();
      start   = in.nextInt();
      end = in.nextInt();
     
      int count=0;
     
      for (int i=start+1;i<end;i++)
      {
         
         if(i==num)
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
