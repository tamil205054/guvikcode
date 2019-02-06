import java.util.Scanner;  
 class Armstrong {  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
        
       int start = s.nextInt();  
        
       int end = s.nextInt();   
       for (int i = start; i <= end; i++) {  
           if (isArmstrong(i)) {  
               System.out.println(i+"\t");  
           }  
       }  
   }  
   public static boolean isArmstrong(int number) {  
        int  originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
        {
            return true;
        }
       return false;  
   }  
}  
