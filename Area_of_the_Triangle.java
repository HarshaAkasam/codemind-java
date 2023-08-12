import java.util.Scanner;
public class Area{
public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    double a,b,c,st,s,A,B;
    a=read.nextInt();
    b=read.nextInt();
    c=read.nextInt();
    st=a+b+c; 
    s=st/2;
    A=(s*(s-a)*(s-b)*(s-c));
    B=Math.sqrt(A); 
    System.out.printf("%.2f",B);
    }
}