import java.util.Scanner; 
class SwapNumbers
{
   public static void main(String args[])
   {
      int x, y, temp; 
      Scanner input = new Scanner(System.in);
      x = input.nextInt();
      y = input.nextInt(); 
      temp = x;
      x = y;
      y = temp;
      System.out.println(x+" "+y);
   }
}
