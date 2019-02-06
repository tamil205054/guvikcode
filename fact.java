import java.util.Scanner;  
 class Fact {  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
        
       int number = s.nextInt();  
    
  int i,fact=1;  
    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println(fact);    
 
}
}  
