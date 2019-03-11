  import java.util.*;
class onetime{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        char ch[]=str.toCharArray();
        int maxlen=0;
        char cha='a';
        for(int i=0;i<ch.length;i++)
        {
int len=0;
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    cha=ch[i];
                    len++;
                }
            }
            if(maxlen<len)
            {
                maxlen=len;
                
            }
        }
        in.close();
        System.out.println(cha+" "+maxlen);
    }
}
