import java.util.*;
public class Pattern9{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n, i, j, k;
        n = x.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (i * 2) - 1; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
