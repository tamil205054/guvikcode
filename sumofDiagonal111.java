
import java.util.*;
class sumOfDiogonal
{
    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
		int arrNum[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{	
				arrNum[i][j]=ip.nextInt();
			}
		} 
		int count=0;
		for(int i=0;i<n;i++)
		{ 
			for(int j=0;j<n;j++)
			{
			  if (i == n - j - 1)
			  {
					count=arrNum[i][j]+count;
				}
			}
		}
		System.out.print(count);
		ip.close();    
    }
}
