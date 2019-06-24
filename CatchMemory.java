import java.util.*;

public class CatchMemory
{
	public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        int k=input.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        List<Integer> result = new ArrayList<Integer>(); 
        for(int i=n-k;i<n;i++)
        {
            result.add(arr[i]);
        }
        for(int i=0;i<result.size();i++)
        {
            System.out.print(result.get(i));
            if(i<result.size()-1)
            {
            System.out.print(" ");
            }
        }
	}
}
