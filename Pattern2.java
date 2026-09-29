import java.util.Scanner;
public class Pattern2 {
 public static void main(String []args){
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    int v=3;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i-j>-1&&(i+j<7)){
            System.out.print(n);
            }
            else{
                System.out.print(" ");
            }
            v--;
        }
        
        System.out.println(" ");
    }

 }
    
}