import java.util.Scanner;

class SpaceRemove
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		System.out.print(str.replaceAll("( )+","/s"));
		input.close();
	}

}
