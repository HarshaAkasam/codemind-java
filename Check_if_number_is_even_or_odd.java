import java.util.Scanner;
public class Even{
public static void main(String[] args){
    Scanner read = new Scanner(System.in);
        int N=read.nextInt();
        if(N%2==0){
            System.out.printf("Even");
        }
        else{
            System.out.printf("Odd");
        }
    }
}