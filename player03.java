import java.util.*;
import java.lang.*;
 class rev
{
    public static void main(String args[])
    {   int fact=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            int digit=n%10;
            fact=fact*10+digit;
            n/=10;
        }
        System.out.println(fact);
    }
}
