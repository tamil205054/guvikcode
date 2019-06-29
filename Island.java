import java.util.*;
public class Island
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int island[][]=new int[n+2][n+2];
		for(int i=0;i<n+2;i++)                                                 
		{
			for(int j=0;j<n+2;j++) 
			{
					island[i][j]=0; 
			 }
		}
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<n+1;j++) 
			{
					island[i][j]=input.nextInt(); 
			 }
		}
		int count=0;
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<n+1;j++) 
			{
				if(island[i][j]==1)
				{
				 	if(island[i-1][j-1]==0&&island[i-1][j]==0&&island[i-1][j+1]==0&&island[i][j+1]==0&&island[i][j-1]==0&&island[i+1][j+1]==0&&island[i+1][j]==0&&island[i+1][j-1]==0)
				 	{
				 		count++;
				 	}
				}
			}
		}
		// for(int i=0;i<n+2;i++)
		// {
		// 	for(int j=0;j<n+2;j++) 
		// 	{ 
				System.out.print(count);
		// 	}
		// 	System.out.println();
		// }
	}
}
