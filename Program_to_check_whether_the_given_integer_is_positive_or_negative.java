import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int N=read.nextInt();
        if(N>=0){
            System.out.printf("Positive Number");
        }
        else
        {
            System.out.printf("Negative Number");
        }
    }
}