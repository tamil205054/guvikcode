 import java.util.Scanner; 
class sap{  
    static int sumOfAP(int a, int d, int n) 
    { 
        int sum = 0; 
        for (int i = 0; i < n; i++) 
        { 
            sum = sum + a; 
            a = a + d; 
        } 
        return sum; 
    } 
    public static void main(String args[]) 
    {  
        Scanner s = new Scanner(System.in);  
        int n = s.nextInt();
        int a = s.nextInt();
        int d = s.nextInt();
        System.out.println(sumOfAP(a, d, n)); 
    } 
} 
