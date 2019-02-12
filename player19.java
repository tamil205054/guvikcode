import java.util.*;
class prime_factor
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        ArrayList<Integer> fact=new ArrayList<Integer>();
        ArrayList<Integer> prime=new ArrayList<Integer>();
        //int factor[]=new factor[number];
        for(int i=2;i<=number;i++)
        {
            if(number%i==0)
            {
                fact.add(i);
            }
        }
        for(int i=0;i<fact.size();i++)
        { 
        int flag=0;
        int num=fact.get(i);
        for(int j = 2; j <= num/2; ++j)
        {
            if(num % j == 0)
            {
                flag =flag+1;
                break;
            }
        }

        if (flag!=1)
        { 
            prime.add(num);
        }
        }
        for(int i=0;i<prime.size();i++)
        {
            System.out.printf("%s ",prime.get(i));
        }
    }
}
