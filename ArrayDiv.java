
import java.util.*;;
 class LocalExtrema
 {
       public static void main(String aa[])
	   {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int count=0;
			int count1=0;
			int sum=0;
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=s.nextInt();
       }
      int k=n/2;
      for(int i=0;i<k;i++){
          sum=sum+a[i];
          count++;
      }
      int d=sum;
      sum=0;
      for(int i=k;i<n;i++){
          sum=sum+a[i];
          count1++;
      }
      int u=sum;
      int l=d/count;
      int p=u/count1;
      if(l==p){
          System.out.println("yes");
      }
 else{
          System.out.println("no");
 }


      
}
}
