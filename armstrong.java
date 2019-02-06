import java.util.Scanner;
class Armstrong {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        
        int number=input.nextInt(), originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
 
