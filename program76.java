import java.util.*;
import java.lang.*;
class com
{
   public static void main(String args[])
   {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int flag=0;
       for(int i=2;i<num;i++)
       {
           if(num%i==0)
           {
               flag=1;
           }
       }
        if(flag==1)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
   }
} 
