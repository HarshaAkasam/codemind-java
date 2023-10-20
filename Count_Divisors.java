import java.util.*;
public class main{
    public static void main(String []args){
        Scanner read = new Scanner(System.in);
        int l,r,k,c=0;
        l = read.nextInt();
        r = read.nextInt();
        k = read.nextInt();
        for(int i=l;i<=r;i++){
            if(i%k==0){
                c++;
            }
        }
        System.out.print(c);
    }
}