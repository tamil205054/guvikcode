import java.util.*;
class roman
{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        String romanletter=in.nextLine();
        romanletter=romanletter.toUpperCase();
        int num=0;
        int decimalNum=0;
        int previousnum = 0;
        for (int i=romanletter.length()-1;i>=0;i--)
        {
            char ch=romanletter.charAt(i);
            switch(ch)
            {  
                    case 'I':
                    num = 1;
                    previousnum = num;
                    break;
                 case 'V':
                    num = 5;
                    previousnum = num;
                    break;
                    case 'X':
                    num = 10;
                    previousnum = num;
                    break;
                    case 'L':
                    num = 50;
                    previousnum = num;
                    break;
            }
            if (num<previousnum)
            {
                decimalNum= decimalNum-num;
            }
            else
            {
                decimalNum= decimalNum+num;
            }
        }
     System.out.print(decimalNum);  
                       
    }
}
