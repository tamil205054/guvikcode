import java.util.Scanner;
class hourcovert
{
    public static void main(String[] args) 
    {
        int minute;
        Scanner s = new Scanner(System.in); 
         minute= s.nextInt();
         System.out.println((minute/60)+" "+(minute%60));
    }
}
