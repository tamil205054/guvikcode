import java.util.*;
import java.lang.*;
class  min
{
    public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
        
        for(int i=1;i<=n;i++ )
       {
           int a=n/i;
           if(a%2==1 && n%i==0)
           {
               System.out.println(i);
               break;
           }
        
       }
       input.close(); 
    }
}
