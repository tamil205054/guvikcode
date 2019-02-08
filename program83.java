import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class opp{

     public static void main(String aa[]){
     double a;
     double  b;
     double y;
     char c;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     c=s.next().charAt(0);
       b=s.nextInt();
   switch(c){
       case '+':
            y=a+b;
           System.out.printf("%.0f",y);
           break;
           case '-':
            y=a-b;
           System.out.printf("%.0f",y);
           break;
           case '/':
            y=a/b;
           System.out.printf("%.0f",y);
           break;
           case '%':
           y=a%b;
           System.out.printf("%.0f",y);
           break;
           
   }
}
}
