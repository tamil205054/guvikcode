import java.util.*;
class apartment
{
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int ava=n-k;
    int pos=2*k;
    int max=Math.min(ava,pos);
    System.out.println(1+" "+max);
    }
}
