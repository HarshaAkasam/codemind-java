import java.util.*;
public class Pattern
{              
    public static void main(String[] args) 
    {
        Scanner read = new Scanner(System.in);
        int n, i, k, j, l;
        n = read.nextInt();
        for (i=0;i<=n-1;i++) 
        {  
            for (j=1;j<=n-i-1;j++) 
            {   
                System.out.print(" ");   
            }   
            for (k=i;k>=1;k--) 
            {  
                System.out.print(k+"");  
            }  
            for (l=0;l<=i;l++)
            {  
                System.out.print(l+""); 
                
            }
            if(i!=(n-1))
            {
                //System.out.print("
");
                System.out.print("
");
            }
        }
    }
}