import java.io.*;
import java.util.Scanner;
class VowelConsonant {

    public static void main(String[] args) {
int count=0;
    	Scanner input = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = input.next().charAt(0);
       switch(ch)
       {
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
           case 'A':case 'E':case 'I':case 'O':case 'U':
            count=count+1;
       }
       if(count==1)
       {
           System.out.println("Vowel");
       }
       else
       {
           if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
           {
               
           System.out.println("Consonant");
           }
           else
           {
               System.out.println("invalid input");
           }
       }
        
    }
}
