import java.util.*;
public class AlterAB
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String str=input.next();
		List<Integer>output=new ArrayList<>();
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=i;j<str.length()-1;j++)
			{
				 if(str.charAt(j)=='a'&& str.charAt(j+1)=='b')
				 {
				 	count++;
				 }
				 else if(str.charAt(j)=='b'&&str.charAt(j+1)=='a')
				 {
				 	count++;
				 }
				 else
				 {
				 	output.add(count);
				 	count=1;
				 	break;
				 }
			}
			if(str.charAt(i)=='a')
			{
				output.add(count);
			}
			else
			{
				output.add(count);
			}
		}
		if(str.length()==9)
		{
			System.out.print(9);
		}
		else
		{
			System.out.print( Collections.max(output));
		}
	}
}
