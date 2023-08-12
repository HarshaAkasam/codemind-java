import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        char ch=x.next().charAt(0);
        if(ch=='V'||ch=='v'){
            System.out.printf("Voilet");
        }else if(ch=='g' ||ch== 'G'){
            System.out.printf("Green");
        }else if(ch=='I'||ch=='i'){
            System.out.printf("Indigo");
        }else if(ch=='B'||ch=='b'){
            System.out.printf("Blue");
        }else if(ch=='Y'||ch=='y'){
            System.out.printf("Yellow");
        }else if(ch=='O'||ch=='o'){
            System.out.printf("Orange");
        }else if(ch=='R'||ch=='r'){
            System.out.printf("Red");
        }else{
            System.out.printf("-1");
        }
    }
}