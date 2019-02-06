import java.util.Scanner;
class odd_even {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int start =input.nextInt();
        int end =input.nextInt();
         for(int i=start+1;i<end;i++)
         {
             if(i%2!=0)
             {
                 System.out.print(i+" ");
             }
         } 
        
    }
}
