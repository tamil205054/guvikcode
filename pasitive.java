import java.util.Scanner;
 class java01
{
    public static void main(String[] args) 
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = input.nextInt(); 
        
        if(number > 0)
        {
            System.out.println("Positive");
        }
        else if(number < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("zero");
        }
    }
}
