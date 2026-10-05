package patterns;
import java.util.Scanner;
public class Pattern94{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=4;
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                for(int j=0;j<n;j++){
              if(i+j==n-1){
                  System.out.print("/");
               }
               else{
                   System.out.print(" ");
               }
            }

           for(int j=0;j<n;j++){
              if(i-j==0){
                  System.out.print("\\");
               }
               else{
                   System.out.print(" ");
               }
            }
        }
          System.out.println(" ");  
        
        sc.close();
    }
 }
}