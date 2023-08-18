import java.util.Scanner;
public class Print{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int i, j, k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-2;j++)
            System.out.print(j);
            {
                for(k=1;k<=n-3;k++)
                System.out.print(k);
                System.out.print("
");
            }
        }
    }
}