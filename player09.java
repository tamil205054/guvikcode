import java.util.*;
class prime
{
    public static void main(String arg[])
    {
        Scanner ip=new Scanner(System.in);
        int start=ip.nextInt();
        int end=ip.nextInt();
        int count=0;
        boolean prime[]=new boolean[end+1];
        for(int i=0;i<=end;i++)
        {
            prime[i]=true;
        }
        for(int p=2;p*p<=end;p++)
        {
            if(prime[p]==true)
            {
                for(int i=p*p;i<=end;i=i+p)
                {
                    prime[i]=false;
                }
            }
        } 
        for(int j=2;j<=end;j++)
        {
            if(prime[j]==true)
            {
                 
                count++;
            }
        }
        
        System.out.print(count);
    }
}
