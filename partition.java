
import java.util.*;
 class  Npartition {

	public static void main(String[] args) {
		int N,A,B;
		Scanner scan=new Scanner(System.in);
		N=Integer.parseInt(scan.nextLine());
		A=Integer.parseInt(scan.nextLine());
		B=Integer.parseInt(scan.nextLine());
		int mod=N%(A+B);
		if(mod%2==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
