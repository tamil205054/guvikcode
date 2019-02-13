import java.util.*;
class number
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        for(int i=2;i<=number;i++)
        {
            if(number%i==0)
            {
                if(i%2==0)
                {
                    System.out.printf("%d ",i);
                }
            }
        }
    }
}
