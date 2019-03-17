
import java.util.*;
class ListSum
	{
		public static void main(String[] args) 
		{
			Scanner ip=new Scanner(System.in);
			int n=ip.nextInt();
			int arrNum[]=new int[n];
			int result[]=new int[n];
			for(int i=0;i<n;i++)
			{
				result[i]=arrNum[i]=ip.nextInt();
				
			}
			Arrays.sort(arrNum);
			int min=0,max=0;
			for(int i=0;i<n;i++)
			{
				if(arrNum[0]==result[i])
				{
					min=i+1;
					break;
				}
			}
			for(int i=0;i<n;i++)
			{
				if(arrNum[n-1]==result[i])
				{
					max=i+1;
					break;
				}
			}
			System.out.print(min+" "+max);
			ip.close();
		}
	} 	
