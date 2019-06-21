
import java.util.*;

public class ReadBook {
  
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int time=in.nextInt();
    int maxread=0;
    for(int i=0;i<n;i++){
      int work=in.nextInt();
      int rem=86400-work;
      if(time>0){
        time-=rem;
        maxread++;
      }
      
    }
    
    System.out.print(maxread);
  }
}
