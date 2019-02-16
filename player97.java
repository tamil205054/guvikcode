import java.util.*;
class sumofodd
	{
	public static void main(String ar[])
		{
		Scanner input=new Scanner(System.in);
		int start=input.nextInt();
		int end=input.nextInt();
		int sum=0;
			for(int i=start;i<=end;i++)
			{
				if(i%2!=0)
				{
					sum=sum+i;   
				}	
			}
		System.out.print(sum);
		}
	}
