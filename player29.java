import java.util.*;
class square
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int s=input.nextInt();
        int e=input.nextInt();
        int count=0;
        for(int i=s;i<=e;i++)
        {
            for(int j=1;j*j<=i;j++)
            {
                if(j*j==i)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
