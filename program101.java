import java.util.Scanner;
class prodect 
{
    public static void main(String args[])
    {  
        String str;
        Scanner s = new Scanner(System.in);
        str = s.next();
        int n=s.nextInt();
        int len=str.length();
        int find=len-n;
        System.out.println(str.substring(find,len));
    }
}
