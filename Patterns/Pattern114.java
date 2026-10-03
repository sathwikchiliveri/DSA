package patterns;
import java.util.Scanner;
public class Pattern114{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              if(i+j>=0&&i-j>=-n/2&&i+j>=n/2&&i+j<=3*n/2&&i-j<=n/2){
                  System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
            }
            System.out.println(" "); 
            }
            System.out.println(" ");

       sc.close();
    }
}