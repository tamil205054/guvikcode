import java.util.*;
class oddCaps
{
	 
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String arrStr[]=str.split(" ");
		for(int i=0;i<arrStr.length;i++)
		{
			StringBuilder sb = new StringBuilder();
			sb.append(arrStr[i]);
			System.out.print(sb.reverse());
			if(i<arrStr.length-1)
			{
				System.out.print(" ");
			}
		}

	}
}
