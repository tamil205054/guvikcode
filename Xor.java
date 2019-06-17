import java.util.*;
public class Xor
{
    public static void main(String[] args) 
    {
       Scanner in=new Scanner(System.in);
    int n=in.nextInt();
      int t=in.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=in.nextInt();
      }
      int[][] xor=new int[n+1][n+1];
      for(int i=1;i<=n;i++){
          int sum=0;
          for(int j=i;j<=n;j++){
              sum=sum^arr[j-1];
              xor[i][j]=sum;
          }
      }
      ArrayList<Integer> li=new ArrayList<Integer>();
      while(t-->0){
          int u=in.nextInt();
          int v=in.nextInt();
          li.add(xor[u][v]);
      }
      for(Integer item:li){
          System.out.println(item);
      }
        in.close();
    }
}
