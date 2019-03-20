import java.util.*;
import java.lang.*;
 class subSet{
     public static void main(String aa[])
	 {
     Scanner s=new Scanner(System.in);
     int m=s.nextInt();
	 int n=s.nextInt();
     int a[]=new int[m];
     int b[]=new int[n];
     for(int i=0;i<m;i++)
	 {
         a[i]=s.nextInt();
     }
	 
     for(int i=0;i<n;i++)
	 {
         b[i]=s.nextInt();
     }
	 int count=0;
    for(int i=0;i<m;i++)
	{
        for(int j=0;j<n;j++)
		{
             if(a[i]==b[j])
			 {
				 count++;
			 }
        }
    }
	if(count==n)
	{
		System.out.print("YES");
	}
	else
	{
		System.out.print("NO");
	}

    }
}
