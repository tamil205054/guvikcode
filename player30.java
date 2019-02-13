import java.util.*;
class change
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        String str1=input.next();
        String str2=input.next();
        int k=input.nextInt();
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
            if(k==count)
            {
                System.out.print("yes");
            }
            else
            {
                System.out.print("no");
            }
        }
    }
}
