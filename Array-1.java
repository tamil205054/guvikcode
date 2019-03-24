
import  java.util.*;
class array
{
    public static  void main(String arg[])
	{
        	Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int arrNum[]=new int[n];
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arrNum[i]=input.nextInt();
		}  	
		for(int i=0;i<n-1;i++)
		{
			if(arrNum[i]>arrNum[i+1])
			{
				result.add(arrNum[i+1]);
			}	
			else
			{
				result.add(-1);
			}
		}   
		result.add(-1);
		for(int i=0;i<result.size();i++)
		{
			System.out.print(result.get(i));
			if(i<result.size()-1)
			{
				System.out.print(" ");
			}
		}
	}
}
