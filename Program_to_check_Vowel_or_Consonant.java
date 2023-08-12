import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        char CH=read.next().charAt(0);
        if(CH=='A'||CH=='E'||CH=='I'||CH=='O'||CH=='U'||CH=='a'||CH=='e'||CH=='i'||CH=='o'||CH=='u'){
            System.out.printf("Vowel");
        }
        else{
            System.out.printf("Consonant");
        }
        
    }
}