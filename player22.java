import java.util.*;
class num
{
    public static void main(String arg[])
    {
        Scanner ip=new Scanner(System.in);
        int  num1=ip.nextInt();
        int num2=ip.nextInt();
        int div=0;
        int max=Math.min(num1,num2);
        for(int i=1;i<=max;i++)
        {
        
            if(num1%i==0&&num2%i==0)
            {
                div=i;
            }
        }
        System.out.print(div);
    }
}
