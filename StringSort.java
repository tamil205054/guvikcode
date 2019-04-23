import java.util.*;
class Str
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		List<String>output=new ArrayList<String>();
		for (int i=0;i<n;i++) 
		{
			String str=input.next().toLowerCase();
			output.add(str);	
		}
		Collections.sort(output);
		for(int i=0;i<output.size();i++)
		{
			System.out.print(output.get(i));
			if(i<output.size()-1)
			{
				System.out.print("\n");
			}
		}
	}
}
