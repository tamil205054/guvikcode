import java.util.*;
class sum
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int num[]=new int[n];
    int num1=0;
    int num2=0;
    for(int i=0;i<n;i++)
		{
			num[i]=input.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(i!=j)
				{
					if(num[i]+num[j]==0)
					{
            num1=num[i];
            num2=num[j];

					}
				}
			}

		}


 System.out.print(num1);
 System.out.print(" ");
 System.out.print(num2);
	}

}
  
