import java.util.*;
class Power
{
    static int power(int a,int b)
    {
        int result=1;
        for(int i=0;i<b;i++)
        {
            result=result*a;
        }
        return result;
    }
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        String str=Integer.toString(number);
        int digit[]=new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            digit[i]=Character.getNumericValue(str.charAt(i));
        }
        int sum=0;
        for(int i=0;i<digit.length;i++)
        {
             
            if(digit.length==1)
            {   
                sum=digit[0]*digit[0];
                 
                break;
            }
             else
            {
             if(i+1<digit.length)
             {
                 sum=sum+power(digit[i], digit[i+1]);
             }
             else
             {
                 sum=sum+power(digit[digit.length-1], digit[0]);
             }
                
            }
                        
                
        }
            
        System.out.println(sum);
        input.close();
    }
}
