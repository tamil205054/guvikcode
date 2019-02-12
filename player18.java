import java.util.*;
class string
{
    public static void main(String ar[])
    {
        Scanner ip=new Scanner(System.in);
        int len=ip.nextInt();
        String str[]=new String[len];
        String giveStr="kabali";
        char cha[]=giveStr.toCharArray();
        Arrays.sort(cha);
        for(int i=0;i<len;i++)
        {
            str[i]=ip.next();
        }
        int flag=0;
        for(int i=0;i<len;i++)
        {
         char  ch[]=str[i].toCharArray();
         Arrays.sort(ch);
         int count=0;
         int arrlen=Math.min(ch.length,cha.length);
            for(int j=0;j<arrlen;j++)
            {     
                 if(ch[j]==cha[j])
                    {
                        count++;
                    }
                    if(count==cha.length)
                    {
                        flag++;
                    }
                
            }
        }
        System.out.println(flag);
    }
}
