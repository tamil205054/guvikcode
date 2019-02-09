import java.util.*;
class sumofap{ 
	public static void main(String[] args) 
	{
		int a,d,n,sum=0;
        Scanner	sc = new Scanner(System.in);
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {   
                sum = sum + a; 
                a = a + d; 
        }
        
        System.out.print(sum);
       
	}
}
