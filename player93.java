import java.util.*;
class swap
	{
		public static void main(String ar[])
		{
			Scanner input=new Scanner(System.in);
			int n=input.nextInt();
			int arrNum[]=new int[n];	
			for(int i=0;i<n;i++)
				{
					arrNum[i]=input.nextInt();
				} 
			 for(int i=0;i<n;i++)
				{
				int temp=0;
					for(int j=i;j<n;j++)
					{
						if(i!=j)
						{
							temp=arrNum[i];
							arrNum[i]=arrNum[j];
							arrNum[j]=temp;
							j=n;
						}	
					}
				i++;	
				}
			for(int i=0;i<n;i++)
			{
				System.out.print(arrNum[i]);
				if(i<n-1)
				{
					System.out.print(" ");
				}

			}
		}
	}
