import java.util.*;
class duplicate
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
			int temp=0; 
			 for(int i=0;i<n;i++)
				{
				for(int j=i;j<n;j++)
					{
						if(i!=j)
						{
							if(arrNum[i]==arrNum[j])
							{
								temp=1;
							}	 
						
						}	
					}
				 	
				}
			 
				if(temp==1)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
				

			
		}
	}
