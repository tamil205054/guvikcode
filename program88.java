import java.util.Scanner;
class lcm {
	
	public static void main(String[] args) 
	{
		int Num1, Num2, GCD = 0, LCM = 0;
        Scanner	sc = new Scanner(System.in);
	    int a = Num1 = sc.nextInt();	
        int b = Num2 = sc.nextInt();
		while(Num2 != 0)
	    {
			if(Num1 > Num2)
			{
				Num1 = Num1 - Num2;
			}
			else
			{
				Num2 = Num2 - Num1;
			}
	    }
		GCD = Num1;
		LCM = (a * b) / GCD;
		System.out.println(LCM);
	}
}
