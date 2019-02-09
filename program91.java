import java.util.*;
class cube{
	
	public static void main(String[] args) 
	{
		int l,b,h;
        Scanner	sc = new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
       System.out.print((2*l*b)+(2*l*h)+(2*h*b)+" ");
        System.out.print(l*b*h);
       
	}
}
