import  java.util.*;
class sumof
{
    public static  void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        int l=input.nextInt();
		int r=input.nextInt();
		int n=input.nextInt();
		 String find = Integer.toString(n); 
		 int count=0;
		for(int i=l;i<r;i++)
		{
			 String str = Integer.toString(i); 
			 if(str.contains(find))
			 {
				 count++;
			 }
		}
		System.out.print(count);
    }
}
