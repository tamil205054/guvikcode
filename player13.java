import java.util.*;
class squareofdigit
{
    public static void main(String ar[]) 
    {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int n,square=0;
        while(num>0)
        {
            n=num%10;
            square =(n*n)+square;
            num=num/10;
        }    
        System.out.print(square);
    }
}
