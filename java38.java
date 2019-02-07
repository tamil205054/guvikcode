import java.util.Scanner;
 class Swap
{
    public static void main(String args[])
    {
        int input1, input2;
        Scanner s = new Scanner(System.in);
        input1 = s.nextInt();
        input2 = s.nextInt();
        input1 = input1 ^ input2;
        input2 = input1 ^ input2;
        input1 = input1 ^ input2;       
        System.out.println(input1+" "+input2);
 
    }
}
