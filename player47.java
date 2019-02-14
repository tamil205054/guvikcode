import java.util.*;
class triangle
{
    public static void main(String ar[])
    {
        Scanner input =new Scanner(System.in);
        int angle1=input.nextInt();
        int angle2=input.nextInt();
        int angle3=input.nextInt();
        int total=angle1+angle2+angle3;
        if(angle1!=0 && angle2!=0 && angle3!=0)
        {
            if(total==180)
            {
                System.out.print("yes");
            }
            else
            {
                System.out.print("no");
            }
        }
        else
        {
            System.out.print("no");
        }
    }
}
