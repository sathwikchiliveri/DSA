package patterns;
import java.util.Scanner;
public class Pattern113{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        for(int i=0;i<n;i++){
            for(int k=0;k<=3;k++){
            for(int j=0;j<n;j++){
              if(i+j==n-1||i-j==0){
                  System.out.print(">>");
               }
               else{
                   System.out.print("  ");
               }
            }
        }
        System.out.println(" ");
        }       sc.close();
    }
}
