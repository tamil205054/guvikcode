 import java.util.*;
class sum{
	
	public static void main(String[] args) 
	{
		int l,sum=0;
        Scanner	sc = new Scanner(System.in);
        l=sc.nextInt();
        int arr[]= new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.print(sum);
       
	}
}
