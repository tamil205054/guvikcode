 import java.util.Scanner;
 class even
{
    public static void main(String args[])
    {
        int number1,number2;
        Scanner s = new Scanner(System.in);
        number1 = s.nextInt();
        number2 = s.nextInt();
        if((number1+number2)%2==0)
        {
            System.out.print("even");
        }
        else
        {
            System.out.print("odd");
        }
        
    }
}
