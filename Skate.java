import java.util.*;
public class Skate
{
	public static void main(String[] args) 
	{
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();
	int flag=0;
	for(int i=0;i<n;i++)
	{
		 int a=input.nextInt();
		 int b=input.nextInt();
		 if(a<b)
		 {
		 	flag++;
		 }
	} 
	System.out.print(flag);
}
}
