import java.util.Scanner;
 class even
{
    public static void main(String args[])
    {
        int m;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        if(m%2==0)
        {
            System.out.print(m);
        }
        else
        {
            System.out.print(m-1);
        }
        
    }
}
