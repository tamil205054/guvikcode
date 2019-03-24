import java.util.*;
class Hotel
{
	public static void main(String ar[])
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int k=input.nextInt();
		int items[]=new int[n];
		
		int annaBill=0;
		for(int i=0;i<n;i++)
		{
			items[i]=input.nextInt();
			 
			if(i!=k)
			{	
				annaBill=annaBill+items[i];
			}
		}
		int totalBill=input.nextInt();
		int diff=totalBill-(annaBill/2);
		if(diff==0)
		{
			System.out.print("Bon Appetit");
		}
		else
		{
			System.out.print(diff);
		}
		
		input.close();
	}	 
} 
