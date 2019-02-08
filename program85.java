import java.util.*;
class value { 
  
    public static void main(String[] args) 
    { 
        Scanner input=new Scanner(System.in);
        String c =input.next(); 
        char ch[] = c.toCharArray(); 
        for(int i=0;i<ch.length;i++)
        {
        System.out.print(ch[i]);
        i++;
        } 
        System.out.print(" ");
        for(int i=1;i<ch.length;i++)
        {
        System.out.print(ch[i]);
        i++;
        }  
    } 
} 
