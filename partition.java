
import java.util.*;
 class  Npartition {

	public static void main(String[] args) {
		int N,A,B;
		Scanner scan=new Scanner(System.in);
		N=Integer.parseInt(scan.next());
		A=Integer.parseInt(scan.next());
		B=Integer.parseInt(scan.next());
		int mod=N%(A+B);
		if(mod%2==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
