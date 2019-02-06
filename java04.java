import java.io.*;
import java.util.Scanner;
class VowelConsonant {

    public static void main(String[] args) {
int count=0;
    	Scanner input = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = input.next().charAt(0);
       
           if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
           {
               
           System.out.println("Alphabet");
           }
           else
           {
               System.out.println("no");
           }
       
        
    }
}
