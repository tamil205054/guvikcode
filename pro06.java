import java.util.*;
class string
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int num[]=new int[n];
		int repeat=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			num[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(num[i]==num[j])
					{
						count=1;
						repeat=num[i];
						j=n;
						i=n;
					}
				}
			}

		}
if(count==1)
{
	System.out.print(repeat);
}
else{
	System.out.print("unique");
}
	}

}
