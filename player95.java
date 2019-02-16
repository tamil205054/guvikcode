import java.util.*;
class duplicate
	{
		public static void main(String ar[])
		{
			Scanner input=new Scanner(System.in);
			int number=input.nextInt();
			String str = Integer.toString(number);
			int n=str.length()-1;
			 int sum=Character.getNumericValue(str.charAt(0))+Character.getNumericValue(str.charAt(n)); 
			System.out.print(sum);

			
		}
	}
