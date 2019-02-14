import java.util.*;
class triangle
{
    public static void main(String ar[])
    {
        Scanner input =new Scanner(System.in);
        int number=input.nextInt(); 
        int k=input.nextInt(); 
        int arr[]=new int[number];
        for(int i=0;i<number;i++)
        {
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr); 
           System.out.print(arr[k-1]);
       
    }
}
