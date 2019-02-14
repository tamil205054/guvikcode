import java.util.*;
class triangle
{
    public static void main(String ar[])
    {
        Scanner input =new Scanner(System.in);
        int number=input.nextInt(),count=0; 
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            { 
            count=1;
            }
        } 
       if(count==1)
       {
           System.out.print("yes");
       }
       else
       {
           System.out.print("no");
       }
    }
}
