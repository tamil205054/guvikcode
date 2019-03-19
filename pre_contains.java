  import  java.util.*;
class array
{
    public static  void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
		 
		String arr[]=new String[n]; 
		
		int count=0;
		for (int i=0;i<n;i++)
        { 
						arr[i]=input.next(); 
        }
		String pre=input.next();
		for (int i=0;i<n;i++)
        {  
if(arr[i].substring(0,pre.length()).equals(pre))
{
	count++;
}
		 
        }
		System.out.print(count);
		
	}
}
