import java.util.*;
public class main{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int x,y;
    x=s.nextInt();
    y=s.nextInt();
    if(x!=0&&x%2==0){
    System.out.println("YES");
    }else if(x==0&&y%2==0){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
  }
}