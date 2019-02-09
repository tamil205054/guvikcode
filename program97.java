import java.util.*;
class rev{ 
	public static void main(String[] args) 
	{
		int num,rev=0;
        Scanner	sc = new Scanner(System.in);
        num=sc.nextInt();
        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num =num/ 10;
        }
        
        System.out.print(rev);
       
	}
}
