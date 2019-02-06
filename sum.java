import java.io.*;
import java.util.Scanner;
class sum{

    public static void main(String[] args) {
int count=0;
    	Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum=0;
       for(int i=1;i<=n;i++)
       {
        sum=sum+i;
        
       }
       System.out.println(sum);
    }
}
