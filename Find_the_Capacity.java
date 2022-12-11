import java.util.*;

public class file {
    public static void main (String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int sectors = scanner.nextInt();
        int tracks = scanner.nextInt();
        int blocks = scanner.nextInt();
        System.out.print((2 * sectors * tracks * blocks * 512) / 1024);
    
        System.out.println("KB");
    }
}