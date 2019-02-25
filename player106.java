import java.util.*;
import java.lang.*;
import java.io.*;
class set
{
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int num[]=new int[n];
		HashSet<Integer> result=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			num[i]=input.nextInt();
			result.add(num[i]);
		}
		Iterator<Integer> itr=result.iterator();
		ArrayList<Integer>pri=new ArrayList<Integer>();
		while(itr.hasNext())
		{
		pri.add(itr.next());
	}
	for (int i=0;i<pri.size();i++ )
	{
	System.out.print(pri.get(i));
	if(i<pri.size()-1)
	{
		System.out.print(" ");
	}
	} 
	}
}
