import java.util.Scanner;
 class digit_count 
{
    public static void main(String args[])
    {
        int m, n,temp,j=0,i=0;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        int Number=m,Count=0;
        while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
        int number[]= new int[Count] ;
        while(m > 0)
        {
            n = m % 10;
            m = m / 10;
            number[j]=n;
            j++;
        }
        for(i=number.length-1;i>=0;i--)
        {
            System.out.print(number[i]+" ");
        }
    }
}
