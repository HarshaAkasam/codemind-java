import java.util.Scanner;
public class Cricle{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int r = read.nextInt();
        double Area=3.14*r*r;
        System.out.printf("%.2f",Area);
    }
}