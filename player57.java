import java.util.*;
class triangle
{
    public static void main(String ar[])
    {
        Scanner input =new Scanner(System.in);
        String str=input.next(); 
        char ch=input.next().charAt(0);
        int count=0;
        int len1=str.length();
        
         for(int i=0;i<len1 ;i++)
         {
             if(str.charAt(i)==ch)
             {
                 count++;
                
             }
         }     
    
             System.out.print(count);
         
    }
}
