import java.util.*;
class checkString
{
    public static void main(String arg[])
    {
        Scanner ip=new Scanner(System.in);
        String str1=ip.next();
        String str2=ip.next();
        int len1=str1.length(); 
        int len2=str2.length();
        int count=0;
            if(len1==len2)
            {
             
                
                for(int i=0;i<len1;i++)
                {
                    if(str1.charAt(i)!=str2.charAt(i))
                    {
                        count++;
                    }
                }
            }
            if(count==1)
            {
                System.out.print("yes");
            }
            else
            {
                System.out.print("no");
            }
    }
}
