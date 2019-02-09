import java.util.*;
import java.lang.*;
 class rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        if(s.length()<=100000)
        {
        StringBuffer sb=new StringBuffer(s);
        String s1=sb.reverse().toString();
        System.out.print(s1);
        }
    }
}
