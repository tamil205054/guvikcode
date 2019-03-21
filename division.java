import java.util.Scanner; 
class a{
    public static void main(String aa[]){
        int div;
        int divisor;
        int ans=1;
        Scanner s=new Scanner(System.in);
        div=s.nextInt();
        divisor=s.nextInt();
		if(div>divisor)
		{
        while(div>divisor){
            div=div-divisor;
            ans++;
        }
		}
		else
		{
			ans=0;
		}
        System.out.println(ans);
        
    }
}
 
