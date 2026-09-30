import java.util.Scanner;
public class Pattern3 {
 public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    
    for(int i=0;i<=n/2;i++){
        for(int j=0;j<=n;j++){
            if(i>=j&&i+j<=n-1){
            System.out.print((n/2-i+j +" "));
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println(" ");
         
    }

 }
    
}