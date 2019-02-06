import java.util.Scanner;
class midle 
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
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }      
        float length=a.length; 
        System.out.println(a[(StrictMath.round(((length)/2)))-1]);
        
         
    }
}
