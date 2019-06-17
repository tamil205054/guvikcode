import java.util.*;
public class Hotel
{
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int item=in.nextInt();
    int[] arr=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
        sum+=arr[i];
    }
    int paid=in.nextInt();
    sum=sum-arr[item];
    sum=sum/2;
    if(paid-sum>0){
        System.out.print(paid-sum);
    }else{
        System.out.print("Bon Appetit");
    }
  }
}
