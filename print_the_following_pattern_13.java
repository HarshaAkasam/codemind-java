import java.util.Scanner;
public class Print{
    public static void main(String [] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int i, j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("
");
        }
    }
}