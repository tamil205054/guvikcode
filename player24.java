import java.util.*;
import java.lang.*;
class numaric
{
    public static void main(String ar[])
    {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int len=str.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                count++;
            }
        }
        if(count==len)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }    
    }
}
