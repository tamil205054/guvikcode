import java.util.*;
public class dog 
{  
	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    if(Math.pow(2,(int)(Math.log(n)/Math.log(2)))==n)
    {
    	System.out.print("YES");
    }
    else
    {
    	System.out.print("NO");
  	}
  	input.close();
  }
}
