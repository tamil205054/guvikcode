import java.util.*;
class TriAngle
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
       int a=input.nextInt(),b=input.nextInt(),c=input.nextInt();
       if(a+b>c&&a+c>b&&b+c>a&&a!=b&&a!=c&&b!=c)
       {
         System.out.print("yes");
       }
       else {
         System.out.print("no");
       }

  }
}
  
