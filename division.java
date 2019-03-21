import java.util.Scanner; 
class a{
    public static void main(String aa[]){
        int div;
        int divisor;
        int ans=1;
        Scanner s=new Scanner(System.in);
        div=s.nextInt();
        divisor=s.nextInt();
        while(div>divisor){
            div=div-divisor;
            ans++;
        }
        System.out.println(ans);
        
    }
}
 
