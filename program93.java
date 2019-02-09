import java.util.*;
class converter{
	
	public static void main(String[] args) 
	{
		int l;
        Scanner	sc = new Scanner(System.in);
        l=sc.nextInt();
        float kelvin= l+ 273.15f;
        System.out.print(Math.round(kelvin));
       
	}
}
