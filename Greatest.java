import java.util.*;

public class Greatest {
  
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    String s=Integer.toString(n);;
    int max=0;
    for(int i=0;i<s.length()-1;i++)
    {
      if(s.charAt(i)==s.charAt(i+1))
      {
          int temp=Integer.valueOf(s.substring(0,i)+s.substring(i+1));
        if(max<temp){
          max=temp;
        }
        i++;
      }
    }
    System.out.print(max);
    input.close();
  }
}
