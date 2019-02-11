import java.util.*;
class Removevowels
{
    public static void main(String ar[]) 
    {
        Scanner input=new Scanner(System.in);
        int len=input.nextInt(),j=0;
        String strn=input.next();
        char reverse[] = new char[len];
        if(strn.length()==len)
        {
        for (int i=0;i<len;i++)
        {
            char str=strn.charAt(i);
            if(str=='a'||str=='e'||str=='i'||str=='o'||str=='u')
            {
              
            }
            else
            {
                reverse[j]=str;
                j++;
            }
        }     
        for(int i=j-1;i>=0;i--)
        {
            System.out.print(reverse[i]);
        }
        }
    }
}
