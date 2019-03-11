import java.util.*;
class string_contains
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='b')
            {
                count++;
            }
        }
        if(count==str.length()||count==str.length()-1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        input.close();
    }
}
