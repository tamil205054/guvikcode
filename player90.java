import java.util.*;
 class combination{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int num1,num2,fact1=1,fact2=1,fact3=1;
num1=input.nextInt();
num2=input.nextInt();
for(int i=1;i<=num1;i++){
	fact1*=i;
}
for(int i=1;i<=num2;i++){
	fact2*=i;
}
for(int i=1;i<=num1-num2;i++){
	fact3*=i;
}
//nCr = n! / r! * (n - r)!
 fact3=fact3*fact2;
 fact1=fact1/fact3;
System.out.println(fact1);
}
}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
