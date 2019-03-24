import java.util.*;
class number
{
public static void main(String arp[])
{
	Scanner input=new Scanner(System.in);
	long n=input.nextLong();
	long count=0;
	for(long i=1;i<=Long.MAX_VALUE;i++)
	{
		long sum = 0;
		long j=i;
        	while (j != 0) 
        	{ 
            		sum = sum +j % 10; 
            		j = j/10; 
        	}
		if(sum==n)
		{
		count=i;
		break;	
		} 	
	}
 
		 
	System.out.print(count);
}
}
