import java.util.*;
class triangle
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=n;i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(1);
                if(j<i-1)
                {
                    System.out.print(" ");
                }
                
            } 
            System.out.println();
        }
    }
}
