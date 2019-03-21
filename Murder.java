import java.lang.*;
import java.util.*;
 class murder {
public static void main(String[] args) 
{
	Scanner in=new Scanner(System.in);
	int a=in.nextInt(),sum=0;
	int a1[]=new int[a];
	for(int i=0;i<a;i++)
	{
		a1[i]=in.nextInt();
	}
	for(int i=0;i<a;i++)
	{
		int a2=a1[i];
		for(int j=a2-1;j>0;j--)
		{
			sum=sum+j;
		}
	}
	System.out.println(sum);
in.close();	
}
}
