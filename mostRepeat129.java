
import java.util.*;
class MostRepat
{
    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
		int arrNum[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arrNum[i]=ip.nextInt();
		}
		int max=0;
		int value=0;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(arrNum[i]==arrNum[j])
				{
					count++;
				}
			}
			if(max<count)
			{
				max=count;
				value=arrNum[i];
			}
		}
		System.out.print(value);
		ip.close();    
    }
}
