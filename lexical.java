import java.util.*;

 class sub{

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int n=str.length();
		int x=0;
		for(int i=1;i<n;i++)
		{
			if(str.charAt(0)<str.charAt(i))
			{
				x=i;
				break;
			}
		}
	 
		 
			for(int i=x;i<n;i++)
			{
				System.out.print(str.charAt(i));
			}
		 
		input.close();

	}

}
