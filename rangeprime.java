import java.util.*;
 class bv
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int bin=0,rem,base=1,n1,n2,count1=0,count2=0;
		n1=scan.nextInt();n2=scan.nextInt();
	    for(int i=n1;i<=n2;i++)
	    {
	    	int count=0;
	    	int n3=i;
	    	while(n3>0)
	    	{
	    		rem=n3%2;
	    		if(rem==1)
	    		   {count=count+1;}
	    		
	    		bin=bin+rem*base;
	    		n3=n3/2;
	    		base=base*10;
	    		
	    		
	    	} 
	    	for(int i1=2;i1<=count;i1++)
	    	{
	    		
	    		if(count%i1==0)
	    			count1=count1+1;
	    	} 
	    	if(count1==1)
	    		count2++;
	    	count1=0;
	    	
	    }
	    
	    System.out.print(count2);
	    
	}

}
