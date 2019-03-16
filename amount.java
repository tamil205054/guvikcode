
import java.util.*;
class sum
{ 	
    public static void main(String[] args) 
    {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
		int k=n/1000;
		n=n%1000;
		int five=n/500;
		n=n%500;
		int hun=n/100;
		n=n%100;
		int fifty=n/50;
		n=n%50;
		int ten=n/10;
		n=n%10;
		int sum=k+fifty+five+hun+ten+n;
		System.out.println(sum);
 

		 
		ip.close();    
    }
}
