import java.io.*; 
 import java.util.*;
class poweroftwo 
{ 
    static int check(int n) 
    { 
        if (n == 0) 
        {
            return 0; 
        } 
        else
        {
        while (n != 1) 
        { 
            if (n % 2 != 0)
            { 
                return 0;
            } 
            n = n / 2; 
        } 
        return 1;
        } 
    }   
    public static void main(String args[]) 
    { 
        Scanner input =new Scanner(System.in);
        int number=input.nextInt();
        if (check(number)==1)
        { 
            System.out.println("yes"); 
        }
        else
        {
            System.out.println("no"); 
        }  
    } 
} 
  
