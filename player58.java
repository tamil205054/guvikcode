import java.util.*;
class triangle
{
    public static void main(String ar[])
    {
        Scanner input =new Scanner(System.in);
        String str1=input.nextLine();
        String arrstr[]=str1.split(" "); 
        String str2=input.next();
        int count=0;
        int len=arrstr.length;
        
         for(int i=0;i<len ;i++)
         {
             if(arrstr[i].equals(str2))
             {
                 count++;
                
             }
         }     
         System.out.print(count); 
         
    }
}
