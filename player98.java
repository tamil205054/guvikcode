import java.util.*;
class check {
	public static void main(String ar[])
	{
		Scanner input=new Scanner(System.in);
		String str=input.next();
		int k=input.nextInt();
		int n=str.length(),count=0; 
		for(int i=0;i<n;i++)
		{
			if(Character.getNumericValue(str.charAt(i))>0 && Character.getNumericValue(str.charAt(i))<=k)
			{
				count++;
			}
		} 
		if(n==count)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
