import java.util.*;
 class arraymerge
  {
   public static void main(String[] args)
   {
     Scanner ip=new Scanner(System.in);
     int n=ip.nextInt();
     int m=ip.nextInt();
     int arr1[]=new int[n];
     int arr2[]=new int[m];
     int marge[]=new int[m+n];
      int count = 0;
      for(int i = 0; i < n; i++)
      {
         arr1[i]=ip.nextInt();
      }
      for(int j = 0; j < m;j++)
      {
         arr2[j]=ip.nextInt();
      }
      for(int i = 0; i < n; i++)
      {
         marge[i] = arr1[i];
         count++;
      }
      for(int j = 0; j < m;j++) {
         marge[count++] = arr2[j];
      }
      Arrays.sort(marge);
      for(int i = 0;i < m+n;i++) System.out.printf("%d ",marge[i]);
   }
}
