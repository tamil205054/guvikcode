import java.util.*;
import java.lang.*;
class  min
{
    public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in);
       int a=input.nextInt();
       int b=input.nextInt();
       int c=input.nextInt();
      System.out.println((int)(Math.pow(a, b))%c);
       input.close(); 
    }
}//3 4 1000000007
