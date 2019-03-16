  import java.util.*;
class oddCaps
{
	 
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String arrStr[]=str.split(" ");
		for(int i=arrStr.length-1;i>=0;i--)
		{
			 System.out.print(arrStr[i]);
			if(i>0)
			{
				System.out.print(" ");
			}
			 
		}
 
	}
}
