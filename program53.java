import java.util.Scanner;
 class digit_count 
{
    public static void main(String args[])
    {
        int m, n,number=0;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            m = m / 10;
             number+=n;
            
        }
        
            System.out.print(number);
        
    }
}
