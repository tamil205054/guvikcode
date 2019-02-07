import java.util.*;
class Order 
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in); 
        n = 10;
        int a[] = new int[n]; 
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
         Arrays.sort(a);
        System.out.print(a[n - 1]);
    }
}
