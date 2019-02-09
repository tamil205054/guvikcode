import java.util.*;
import java.lang.*;
 class rev
{
    public static void main(String args[])
    {   int fact=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
