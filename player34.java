import java.util.*;
class find
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
          String str=input.next();
          int n=str.length(); 
            for(int i=0;i<n;i++)
            {
            
                System.out.print(str.charAt(i)); 
                i=i+2;
            } 
            
        
    }
}
