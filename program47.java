import java.util.*;
class minmax 
{
    public static void main(String[] args) 
    {
        int n, temp;
        Scanner s = new Scanner(System.in); 
        n = s.nextInt();
        int a[] = new int[n]; 
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
         Arrays.sort(a);
        System.out.print(a[0]+" "+a[n - 1]);
    }
}
