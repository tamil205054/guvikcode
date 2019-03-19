import  java.util.*;
class array
{
    public static  void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
		int k=input.nextInt();
		int arr[]=new int[n]; 
		int count=0;
		for (int i=0;i<n;i++)
        { 
			   arr[i]=input.nextInt();
			   if(arr[i]<=k)
			   {
				   count++;
			   }
        }
		System.out.print(count);
		
	}
}
