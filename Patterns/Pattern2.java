package patterns;
import java.util.Scanner;
public class Pattern2 {
 public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    int n =7;
    for(int i=0;i<n;i++){
        for(int j=0;j<=n;j++){
            if(i>=j&&i+j<=n-1){
            System.out.print((3-j +" "));
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println(" ");
         
    }

 }
    
}