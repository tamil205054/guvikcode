import  java.util.*;
class array
{
    public static  void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arrNum[]=new int[n];
		List<Integer> result=new ArrayList<Integer>();
        for (int i=0;i<n;i++)
        {
            arrNum[i]=input.nextInt();
		 
        }	
        Arrays.sort(arrNum);
		int j=0;
		int k=n-1;
        for (int i=0;i<n;i++)
        { 
			if(i%2!=0)
			{
				result.add(arrNum[j]);
				j++;
			}
			else
			{
				result.add(arrNum[k]);
				k--;
			}
        }
		for (int i=0;i<result.size();i++)
        { 
			System.out.print(result.get(i));
			if(i<result.size()-1)
			{
				System.out.print(" ");
			}
        }	
 		
    }
}
