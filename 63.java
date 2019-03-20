import java.util.*;
class longsubchar
{ 
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    char ch[]=a.toCharArray();
	    int n=a.length();
	    int i,count=1,j,b=0,c=0;
	    for(i=1;i<n;i++)
	    {
	        b=0;
	        for(j=0;j<i;j++)
	        {
	            if(ch[i]==ch[j])
	            {
	                b=1;
	                count=0;
	                j=i;
	            }
	        }
	        if(b==0)
	        {
	            count++;
	        }
	        if(count>c)
	        {
	            c=count;
	        }
	    }
	    System.out.println(c);
	} 
} 
 
