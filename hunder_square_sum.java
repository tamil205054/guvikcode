import java.util.*;
class sum
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int sum=0;
        while (n != 0) 
        {   int m=n % 10;
            sum = sum +(m*m);  
            n = n/10; 
        }
        System.out.println(sum);
        input.close();
    }
}
