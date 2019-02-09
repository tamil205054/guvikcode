import java.lang.*;
import java.util.*;
 
 class gcd
{
    public static void main(String args[])
    {
        int a,b,result=0;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        
        int n=Math.min(a,b);
        for (int i=1;i<=n;i++)
        {
            if(a%i==0 && b%i==0)
            {
                result=i;
            }
        }
      
        System.out.println(result);
    }
}
