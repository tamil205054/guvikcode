import java.util.Scanner;

public class Rectangle
 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int P=in.nextInt(),l=0,b=0;
        int A=in.nextInt();
        P /= 2;
        int a=P,flag=0;
        for(int i=0;i<=P/2;i++)
        {
            if(i+a==P && i*a==A)
            {
                flag=1;
                l=i;
                b=a;
            }
            a--;
        }
        if(flag!=0)
            {
                System.out.println("yes");
            }
        else
            {
                System.out.println("no");
            }

    }
}
