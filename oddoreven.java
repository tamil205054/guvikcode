import java.util.Scanner;
 class java01
{
    public static void main(String[] args) 
    {
        int number=5;
         
        
        if(number > 0)
        {
            if(number%2==0)
            {
                System.out.println("Even");
            }
            else
            {

                System.out.println("Odd");
            }
        }
        else{
            System.out.println("invalid input");
        }
    }
}
