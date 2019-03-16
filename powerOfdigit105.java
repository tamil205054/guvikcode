import java.util.*;
class sum
{
	static int power(int a,int b)
	{
		int result=a;
		for(int i=1;i<b;i++)
		{
			result=result*a;
		}
		return result;
	}
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
		int Count=0;
		int num=n;
		while(num> 0) 
		{
			num = num / 10;
			Count = Count + 1; 
		}
		int  sum=0;
        while (n != 0) 
        {   int m=n % 10;
            sum=power(m,Count)+sum;
            n = n/10; 
        } 
        System.out.print(sum);
        
        input.close();
    }
}
