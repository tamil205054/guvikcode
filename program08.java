import java.util.*;
class Case
{
    public static void main(String ar[])
     {
        Scanner in=new Scanner(System.in);
        String sen=in.nextLine();
        int len=0,k=0;
        String str[] = sen.split(" ", 0);
        for(int i=0;i<str.length;i++)
        {
             str[i]=str[i].replace(str[i].charAt(0),Character.toUpperCase(str[i].charAt(0)));
             for(int j=1;j<str[i].length();j++)
             {
                  str[i]=str[i].replace(str[i].charAt(j),Character.toLowerCase(str[i].charAt(j))); 
             } 
             System.out.print(str[i]+" ");   
        }
    }
}
