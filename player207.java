 import  java.util.*;
 class triangle
 {
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      int b=input.nextInt();
      int h=input.nextInt();
      if(b<=100000&&h<=100000)
      {
        int area=(b*h)/2;
        System.out.print(area);
      }
   }
 }
