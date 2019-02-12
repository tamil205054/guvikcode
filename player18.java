import java.util.*;
class string
{
    public static void main(String ar[])
    {
        Scanner ip=new Scanner(System.in);
        int len=ip.nextInt();
        String str[]=new String[len];
        String giveStr="kabali";
        for(int i=0;i<len;i++)
        {
            str[i]=ip.next();
        }
        int flag=0;
        for(int i=0;i<len;i++)
        {
         char   ch[]=str[i].toCharArray();
         int count=0;
            for(int j=0;j<ch.length;j++)
            {
                if(ch[j]==giveStr.charAt(j))
                {
                    count++;
                }
                if(count==ch.length)
                {
                    flag++;
                }
            }
        }
        System.out.println(flag);
    }
}
