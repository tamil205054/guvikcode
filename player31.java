import java.util.*;
class bracket
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int len=str.length();
        int count1=0,count2=0;
            for(int i=0;i<len;i++)
            {
                if(str.charAt(i)==')')
                {
                    count1++;
                }
                else if(str.charAt(i)=='(')
                {
                    count2++;
                }
            } 
            if(count1==count2)
            {
                System.out.print("yes");
            }
            else
            {
                System.out.print("no");
            }
        
    }
}
