import java.util.Scanner;
public class Multiply{
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        float a = read.nextFloat();
        float b = read.nextFloat();
        System.out.printf("%.2f",a*b);
    }
}