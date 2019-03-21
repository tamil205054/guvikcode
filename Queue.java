import java.util.*;
class Queue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
        int n=input.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
		{
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        
        int time=0;
        int happy=0;
        
        for(int i=0;i<n;i++)
        {
            if(time<=arr[i])
			{
                happy++;
			}
            time+=arr[i];
        }
        System.out.println(happy);
		input.close();
    }
}
