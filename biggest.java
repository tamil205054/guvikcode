import java.io.*;
import java.util.Scanner;
class VowelConsonant {

    public static void main(String[] args) {
int count=0;
    	Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
           if(num1>num2&&num1>num3)
           {     
           System.out.println(num1);
           }
           
           else if(num2>num1&&num2>num3)
           {     
           System.out.println(num2);
           }
           else
           {
               System.out.println(num3);
           }
       
        
    }
}
