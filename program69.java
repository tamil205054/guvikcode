import java.util.Scanner;
 class evenodd
{
    public static void main(String args[])
    {
        
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
    
       
            if((m-n)/2==0)
            {
                System.out.println("even");
            }
            else
            {
                System.out.println("odd");
            }
    }
}
