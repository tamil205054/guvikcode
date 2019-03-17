    
import java.util.*;
class sum
{
    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
		int arrNum[]=new int[n];
		 int count=0,num=0;
			for(int j=0;j<n;j++)
			{	
				arrNum[j]=ip.nextInt();
			}
		for(int i=0;i<n;i++)
		{ 
			count=0;
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(arrNum[i]==arrNum[j])
					{
						count++;
					}
				}
			}
			if(count==0)
			{ 
				 num=arrNum[i];
				 break;
			}
		}
		System.out.print(num);
		ip.close();    
    }
}












