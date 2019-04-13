import java.util.*;
class Pali
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        String str=Integer.toString(x);
        int count=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)=='0')
            {
                count++;
            }
            else
            {
                break;
            }
        }   
        String zero=""; 
        for(int i=0;i<count;i++)
        {
            zero+="0";
        }
        str=zero+""+str;
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        if(str.equals(rev))
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