
import java.util.*;
class candy
{
    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
		int arrNum[]=new int[n];
		 
			for(int j=0;j<n;j++)
			{	
				arrNum[j]=ip.nextInt();
			}
			Arrays.sort(arrNum);
			int sum=n;
				for(int i=0;i<n-1;i++)
				{	
					 if(arrNum[i]<arrNum[i+1])
					 {
						 	for(int j=i+1;j<n;j++)
							{
								sum++;
							}
					 }
				}  
				System.out.println(sum);
		ip.close();    
    }
}
