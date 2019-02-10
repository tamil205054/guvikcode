import java.util.*;
 class Check {
      public static void main(String[] args) {
      int i,n,m=0,k=0;
      String a,b;
      Scanner scan=new Scanner(System.in); 
      a=scan.nextLine(); 
      b=scan.nextLine();
      n=a.length();
      for(i=0;i<n;i++)
      {
          for(int j=i+1;j<n;j++)
      {
          if(a.charAt(i) == a.charAt(j))
          {
              m=i;
              k=j;
          }
      }
    }

      if(b.charAt(m)==b.charAt(k))
      {
          System.out.println("yes");
      }
      else
      {
          System.out.println("no");
      }
    }
 
}
