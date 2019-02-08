import java.util.*;
import java.lang.*;
class round
{
   public static void main(String args[])
   {
        String str ;
        Scanner in = new Scanner(System.in);
        str = in.next();
        int len=str.length();
        char charArray[]=str.toCharArray();  
        if(len%2!=0)
        {
        int middle=len/2;
        charArray[middle]='*';
        }
        else
        {
        int middle=len/2;
        charArray[middle-1]='*';
        charArray[middle]='*';

        }
        for(int i=0;i<len;i++)
        {            
             System.out.print(charArray[i]);
        }
        
   }
} 
