import java.util.*;
class substring
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next().toLowerCase();
        String str1=input.next().toLowerCase();
        if(str.contains(str1))
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
