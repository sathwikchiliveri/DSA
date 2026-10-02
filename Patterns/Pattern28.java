package patterns;
import java.util.Scanner;
public class Pattern28{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              if((i+j==n/2||i-j==-n/2)){
                  System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
            }
        System.out.println(" ");
        }
       sc.close();
    }
}
