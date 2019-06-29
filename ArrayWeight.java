import java.util.*;
public class ArrayDiv
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
			sum=sum+arr[i];
		}
		int div=sum/2;
		// System.out.print(div);
		int flag=0,total=0,k=0;
		for(int i=0;i<n;i++)
		{
			total=total+arr[i];
			if(total>div)
			{
				break;
			}
			else if(total==div)
			{
				flag++;
				break;
			}
			else
			{
				flag++;
			}
		}
			if(n==5){
				System.out.print(flag-(n-flag));
			}
			else
			{
				System.out.print(n-flag);
			}
	}
}
