package patterns;
import java.util.Scanner;
public class Pattern2 {
 public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int v=4;
    for(int i=0;i<n;i++){
        for(int j=0;j<=n-i-1;j++){
            if(i>=j&&i+j<=n-1){
            System.out.print((v-j-1 +" "));
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println(" ");
         
    }

 }
    
}