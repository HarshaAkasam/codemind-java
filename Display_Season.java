import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int N=read.nextInt();
        if(N==4||N==5||N==6){
            System.out.printf("Summer");
        }
        else if(N==7||N==8||N==9||N==10){
            System.out.printf("Rainy");
        }
         else if(N==11||N==12||N==1){
            System.out.printf("Winter");
        }
        else if(N==2||N==3){
            System.out.printf("Spring");
        }
        else{
            System.out.printf("-1");
        }
    }
}