import java.util.Scanner;
class prodect 
{
    public static void main(String args[])
    {  
        String str;
        Scanner s = new Scanner(System.in);
        str = s.next();
        int n=s.nextInt();
        int find=str.length()-n;
        System.out.println(str.charAt(find));
    }
}
