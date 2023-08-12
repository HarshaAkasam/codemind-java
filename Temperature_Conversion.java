import java.util.Scanner;
public class Temp{
public static void main(String[] args){
    Scanner read = new Scanner(System.in);
    double t=read.nextInt();
    double F=32+(t*9/5);
    System.out.printf("%.2f",F);
    }
}