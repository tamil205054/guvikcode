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
     int len=m+n;
     int marge[]=new int[len];
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
      int j=1;
      for(int i = 0;i < len;i++)
      {
      System.out.print(marge[i]);
      if(j<len)
      {
  System.out.print(" ");
  j++;
}
}
   }
}
