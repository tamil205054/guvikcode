import java.util.*;

public class Vowels {
  
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String s=input.next();
    s=s.toLowerCase();
    int c=0;
    int t=0;
    for(int i=0;i<s.length()-1;i+=2){
      if((!(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'))&&(s.charAt(i+1)=='a'||s.charAt(i+1)=='e'||s.charAt(i+1)=='i'||s.charAt(i+1)=='o'||s.charAt(i+1)=='u')){
        t+=2;
        c=Math.max(c,t);
      }
      else{
        t=0;
      }
    }

    System.out.print(c);

      
  }
}
