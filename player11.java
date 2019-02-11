import java.util.*;
class holiday
{
    public static void main(String arg[])
    {
        Scanner ip=new Scanner(System.in);
        String day=ip.next().toLowerCase();
        
        if(day.equals("sunday")||day.equals("saturday"))
        {
            System.out.print("yes");    
        }
        else
        {
            System.out.print("no");
        }
    }
}
