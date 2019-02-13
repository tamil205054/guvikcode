import java.util.*;
class number
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int number,digit,find,count=0;
        number=input.nextInt();
        find=input.nextInt();
        while(number > 0)
        {
            digit = number % 10;
             if(digit==find)
             {
                 count++;
             }
            number = number / 10;
        }
        System.out.print(count);
    }
}
