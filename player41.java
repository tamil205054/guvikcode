import java.util.*;
class number
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int p=input.nextInt();
        boolean check=((int)(Math.ceil((Math.log(n) / Math.log(p)))) ==(int)(Math.floor(((Math.log(n) / Math.log(p))))));
        if(check== true)
        {
        System.out.print("yes");
        }
        else
        {
        System.out.print("no");
        }      
    }
}
