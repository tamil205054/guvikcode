  import java.util.*; 
class arraypair
{
	public static void main (String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String arrStr[]=str.split(" ");
		List<String> result=new ArrayList<String>();
		int odd=1;
		for(int i=0;i<arrStr.length;i++)
		{
			if(odd%2!=0)
			{
				
			 String rev="";
				for(int j=arrStr[i].length()-1;j>=0;j--)
				{
					rev=rev+arrStr[i].charAt(j);
				}
				result.add(rev);
			}
			else
			{
				result.add(arrStr[i]);
			}
			odd++;
		}
					for(int i=0;i<result.size();i++)
					{
						System.out.print(result.get(i));
						if(i<result.size()-1)
						{
							System.out.print(" ");
						}
					}
 		input.close();
	}
}
