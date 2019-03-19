import  java.util.*;
class array
{
    public static  void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
		int arr[]=new int[n]; 
		int count=0;
		for (int i=0;i<n;i++)
        { 
			arr[i]=input.nextInt();
        }
		int u=input.nextInt();
		int v=input.nextInt();
		int start=0;
		int end=0;
		for (int i=0;i<n;i++)
		{
			if(arr[i]==u)
			{
				start=u;
				end=v;
				break;
			}
			if(arr[i]==v)
			{
				start=v;
				end=u;
				break;
			}
			
		}int flag=0;
				for (int i=0;i<n;i++)
				{	
					if(arr[i]==start)
					{
						flag=1;
					}
					if(arr[i]==end)
					{ 
						break;
					}
					if(flag==1)
					{
						count++;
					}
				}
				System.out.print(count);
	}
}
