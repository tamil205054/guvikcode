import java.util.Scanner;
 class even
{
    public static void main(String args[])
    {
        
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n=10,count=0;
        boolean bool=true;
        while(bool)
        {
            if(m<n)
            {
                count=n;
                bool=false;
            }
            n=n+10;
        }
        System.out.println(count);
    }
}
