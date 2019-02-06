import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        int n, m, a = 0,x;
        Scanner s = new Scanner(System.in);
         
        n = s.nextInt();
        m = n;
        if(n<=1000)
        {
        while(n > 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
        if(a == m)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        }
        else
        {
            System.out.println("cross the input limit");
        }
    }
}
