import java.util.Scanner;
public class Avg{
    public static void main(String [] args){
        Scanner read = new Scanner (System.in);
        float a = read.nextFloat();
        float b = read.nextFloat();
        float c=(a+b)/2;
        System.out.printf("%.4f",c);
    }
}