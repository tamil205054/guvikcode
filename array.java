import java.io.*;
import java.util.Scanner;
class array{

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int i;
        int []array=new int[10];
        int sum=0;
        for(i=0;i<N;i++)
        {
            array[i]=input.nextInt();
        }
        for(i=0;i<K;i++)
        {
            sum=sum+array[i];
        }
        System.out.println(sum);
    }
}
