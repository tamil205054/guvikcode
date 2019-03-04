import java.util.*;
class TriAngle
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
       int a=input.nextInt(),b=input.nextInt(),c=input.nextInt();
       if(a>b&&a>c)
        {
          if((a*a)==(b*b)+(c*c))
            {
              System.out.println("yes");
            }
          else
            {
              System.out.println("no");
            }
        }
      if(b>c&&b>a)
        {
          if((b*b)==(c*c)+(a*a))
            {
              System.out.println("yes");
            }
          else
          {
            System.out.println("no");
          }
        }
        if(c>a&&c>b)
          {
            if((c*c)==(a*a)+(b*b))
            {
              System.out.println("yes");
            }
            else
            {
             System.out.println("no");
            }
          }
  }
}
