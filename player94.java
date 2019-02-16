import java.util.*;
class duplicate
	{
		public static void main(String ar[])
		{
			Scanner input=new Scanner(System.in);
			int number=input.nextInt();
			  String str = Integer.toString(number);
			int temp=0,n=str.length(); 
			 for(int i=0;i<n;i++)
				{
				for(int j=i;j<n;j++)
					{
						if(i!=j)
						{
							if(str.charAt(i)==str.charAt(j))
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
