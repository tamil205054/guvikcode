import java.util.*;
public class Median
{
	public static void main(String[] args) 
	{
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		List<Integer> arrList=new ArrayList<Integer>();
		for (int i=0;i<n;i++) 
		{
			arrList.add(input.nextInt());			
		}	
		while(arrList.size()>0)
		{
			if(arrList.size()%2==0)
			{
				int i =(int)Math.floor(arrList.size()/2);
				System.out.println((int)Math.floor((arrList.get(i)+arrList.get(i-1))/2));
				i=i-1;
				arrList.remove(arrList.get(i));
				arrList.remove(arrList.get(i));
			}
			else
			{
				int i=(int)Math.floor(arrList.size()/2);
				System.out.println(arrList.get(i));
				arrList.remove(arrList.get(i));
			}
		}
	}
}
