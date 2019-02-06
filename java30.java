import java.util.Scanner;
class timeminus
{
    public static void main(String[] args) 
    {
         
        Scanner s = new Scanner(System.in); 
         int hour1= s.nextInt();
         int minute1= s.nextInt();
         int hour2= s.nextInt();
         int minute2= s.nextInt();
         int minute,hour;
         if(hour1>hour2&&minute1>minute2)
         {
             minute=minute1-minute2;
             hour=hour1-hour2;
         }
         else
         {
             minute=minute2-minute1;
             hour=hour2-hour1;
         }

         System.out.println(hour+" "+minute);
    }
}
