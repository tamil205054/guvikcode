import java.util.*;
class div
{
    public static void main(String ar[]) 
    {
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int j=1000000000,ans=0;
        int start=Math.max(num1,num2);
   
        for(int i=start;i<j;i++)
        {
            if(i % num1==0 && i % num2==0)
            {
               ans=i;
               i=j;
            }
        }    
        System.out.print(ans);
    }
}
