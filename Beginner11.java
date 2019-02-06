import java.io.*;
import java.util.Scanner;
class power{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x=input.nextFloat();
        double y=input.nextFloat();
        System.out.println(Math.round(Math.pow(x, y)));
    }
}
