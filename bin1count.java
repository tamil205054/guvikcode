import java.util.*; 
class Index
{
	public static void main (String[] args)
	{
		
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		String  str1=Integer.toBinaryString(a*b);
		  int flag=0;
		 
			for(int j=0;j<str1.length();j++)
			{
				if(str1.charAt(j)=='1')
				{
					 flag++;
				}
			}

					System.out.print(flag);

		input.close();
	}
}	
