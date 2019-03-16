
import java.util.*;
class repeat
{
    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
		int sum=0,reve=0,remain,original;       
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
		original=sum;
		while( sum != 0 )
        {
            remain = sum % 10;
            reve = reve * 10 + remain;
            sum  /= 10;
        }
		if(original==reve)
		{
		System.out.print("yes");
        }
		else
		{
			System.out.print("no");
		}
		ip.close();    
    }
}
