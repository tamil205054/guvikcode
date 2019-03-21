import java.util.*;

class number{
  public static boolean isPrime(int n) 
    {
        for (int i=2;i<=Math.sqrt(n)+1;i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
		public static void main(String[] args) 
		{
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int sum=0;
        for(int i=3;i<n;i+=10)
		{
            if(isPrime(i))
			{
                sum=sum+i;
			}
		}
        System.out.println(sum);
        sc.close();        
    }
   
}
