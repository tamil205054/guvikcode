import java.util.*;
class find{
	
	public static void main(String[] args) 
	{
		int l,find;
        Scanner	sc = new Scanner(System.in);
        l=sc.nextInt();
        find=sc.nextInt();
        int arr[]= new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(arr[find-1]);
       
	}
}
