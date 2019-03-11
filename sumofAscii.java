import java.util.*;
class ascii
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        char ch[]=str.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++)
        {
            int as=ch[i];
            sum=sum+as;
        }
        input.close();
        System.out.println(sum);
    }
}
