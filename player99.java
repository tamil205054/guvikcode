import java.util.*;
class OctalConverter
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
       int binary=input.nextInt();
       int octal=0,decimal=0;
       int i=0;
       while(binary !=0)
       {
         decimal+=(binary%10)*Math.pow(2,i);
         ++i;
         binary/=10;
       }
       i=1;
       while(decimal !=0)
       {
         octal+=(decimal%8)*i;
         decimal/=8;
         i*=10;
       }
       System.out.print(octal);
  }
}
