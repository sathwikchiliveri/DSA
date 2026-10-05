package patterns;
import java.util.Scanner;
public class sandbox{
 public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    
    for(int i=0;i<=n;i++){
        for(int j=0;j<2*n-1;j++){
            if(i+j>=n-1){
                System.out.print(("* "));
            }
            else{
            System.out.print(" ");
        }
    }
      System.out.println(" "); 
}  
    
    for(int k=2*n-1;k<n;k--){
        
         System.out.print("* ");
        }
          System.out.println(" ");  
        
   }
 }
