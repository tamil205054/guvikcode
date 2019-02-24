 import java.util.*;
 import java.lang.*;
 class number
 {
     public static void main(String arg[])
     {
         Scanner input=new Scanner(System.in);
         int n=input.nextInt();
         int ar[]=new int[n];
         for(int i=0;i<n;i++)
         {
           ar[i]=input.nextInt();
         }
         Arrays.sort(ar);
         for(int i=n-1;i>=0;i--)
         {
           System.out.println(ar[i]);
         }
     }
 }
