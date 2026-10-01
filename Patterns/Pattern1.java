package patterns;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
      
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if((i-j>=0)&&(i+j<n)){
          System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        System.out.print(" ");
    }
    System.out.println(" ");
}
    }
    
}
