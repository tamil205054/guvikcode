import java.util.*;
public class Road_Damage
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		 int n=input.nextInt();
		int k=input.nextInt();
		String str=input.next();
		str=str.substring(0,n);
	  	int count=0;
	  	int start=0;
	  	int end=0;
	  	for(int i=0;i<str.length();i++)
	  	{
	  		if(str.charAt(i)=='*')
	  		{
	  			start=i;
	  			i=str.length();
	  		}
	  	}
	  	for (int i=str.length()-1;i>=0;i--) 
	  	{
	  		if(str.charAt(i)=='*')
	  		{
	  			end=i;
	  			i=-1;
	  		}
	  	}
	  	if(start!=0)
	  	{
	  		start=start-1;
	  	}
	  	else
	  	{
	  		start=start+1;
	  	}
	  	int total=start+end;
	  	while(total>0)
	  	{
	  		total=total-k;
	  		count++;
	  	}
	  	System.out.println(count); 
		input.close();	
	}
}
