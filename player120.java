import java.util.Scanner;

class Decimal
{
        public static void main(String args[])
        {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            String b=Integer.toBinaryString(n);
            System.out.println(b.length());
        }
}
