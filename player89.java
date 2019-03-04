import java.util.*;
 class permutation{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int num1,num2,flag=1,temp=1;
num1=input.nextInt();
num2=input.nextInt();
for(int i=1;i<=num1;i++){
	flag*=i;
}
for(int i=1;i<=num1-num2;i++){
	temp*=i;
}
//  P ( n , r ) = n ! ( n − r ) !
System.out.println(flag/(temp));
}
}
