import java.util.*;
import java.lang.*;
class square
{
   public static void main(String args[])
   {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int prodect=num1*num2,flag=0;
        for(int i=1;i<=Math.max(num1,num2);i++)
        {
            if(i*i==prodect)
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
