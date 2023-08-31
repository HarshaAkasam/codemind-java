import java.util.*;
public class Pattern5{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n,i,j;
        n=x.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j){
                    System.out.print("0");
                } else {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}
