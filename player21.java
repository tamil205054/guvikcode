import java.util.*;
class line
	{
		public static void main(String ar[])
		{
			Scanner input=new Scanner(System.in);
			int arrX[]=new int[3];
			int arrY[]=new int[3];
			for(int i=0;i<3;i++)
			{
					arrX[i]=input.nextInt();
					arrY[i]=input.nextInt();
			}
			int count=0;
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<i;j++)
					{
						if(i!=j)
						{
							if(arrX[i]==arrX[j] || arrY[i]==arrY[j])
							{
								count++;
							}
						}
					}
			}
			if(count ==3)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
			}
	}
