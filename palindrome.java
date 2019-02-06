import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        int number, m, a = 0,x;
        Scanner input = new Scanner(System.in);
         
        number = input.nextInt();
        m = number;
        if(number<=1000)
        {
        while(number > 0)
        {
            x = number % 10;
            a = a * 10 + x;
            number = number / 10;
        }
        if(a == m)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        }
        else
        {
            System.out.println("cross the input limit");
        }
    }
}
