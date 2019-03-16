import java.util.*;
class matrix
{
	public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int m=ip.nextInt();
		int arrNum[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arrNum[i][j]=ip.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arrNum[i][j]==0)
				{ 
						for(int k=0;k<m;k++)
						{
							arrNum[i][k]=0;
						}
					 
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arrNum[i][j]);
				if(j<m-1)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
