import java.util.*;
 class Check {
      public static void main(String[] args) {
      int i;
      char t='a';
      String str,b;
      Scanner scan=new Scanner(System.in); 
      str=scan.nextLine();
      char ch[]=str.toCharArray();
      int n=ch.length;

      for(i=0;i<n;i++)
      {
          for(int j=i+1;j<i+2;j++)
          {
              t=ch[i];
              ch[j]=ch[j];
              t=ch[i];
              System.out.print(ch[j]+""+ch[i]);      
          }
          i++;
      } 
  
    }
    
}
