import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        int m, n, sum = 0;
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        if(sum%2==0)
        {
        System.out.print("E");
        }
        else
        {
        System.out.println("O");
      }
    }
}
