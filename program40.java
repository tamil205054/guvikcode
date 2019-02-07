 import java.util.*;
class fib{  
public static void main(String args[])  
{   
Scanner input=new Scanner(System.in);
int count=input.nextInt(); 
 int n1=0,n2=1,n3,i;    
 System.out.print(n2);     
 for(i=2;i<=count;++i) 
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}
} 
