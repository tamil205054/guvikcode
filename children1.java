 import java.util.*;
 class children {
	public static void main(String[] args) {
		 
		Scanner in=new Scanner(System.in);
		System.out.println("enter the 2n children in n pair");
		double a=in.nextDouble();
		 
		int c=1;
		for(int i=1;i<a;i++){
			c*=i;
		}
System.out.println(c);
}
}
