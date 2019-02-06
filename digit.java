import java.io.*;
import java.util.Scanner;
class digit{

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int count=0;
       while(N>0)
       {
           N=N/10;
           count+=1;
       }
       System.out.println(count);
    }
}
