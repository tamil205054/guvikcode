import java.util.*;
public class BdayCake
{
// tamil
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		String cake[][]=new String[m][n];
		for (int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++)
			{
			cake[i][j]=input.next().toUpperCase();	
			}
				
		}
		int count=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				 	if(cake[i][j].equals(cake[i][j+1]))
				 	{
				 		 
				 		if(cake[i][j].equals("R"))
				 		{
				 			count+=5;
				 		}
				 		else
				 		{
				 			count+=3;
				 		}
				 		j++;
				 	}
			}
		}
		System.out.print(count);
	}
}
