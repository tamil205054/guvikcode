import java.util.Scanner;
class prodect 
{
    public static void main(String args[])
    {
        int m, n, sum = 1;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum * n;
            m = m / 10;
        }
        System.out.println(sum);
    }
}
