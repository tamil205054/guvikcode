import java.util.*;
class find{
	
	public static void main(String[] args) 
	{
		int l,find=0;
        Scanner	sc = new Scanner(System.in);
        l=sc.nextInt();
        int arr[]= new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        //1 2 3 5 4 6 7 
        for(int k=0;k<l-1;k++)
        {
        
            if(arr[k]>arr[k+1])
            {
                find=k-1;
                k=l-1;
             }
        }
      
        System.out.print(arr[find]);
	}
}
