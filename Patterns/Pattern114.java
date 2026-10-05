package patterns;

public class Pattern114{
    public static void main(String []args){
      
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              if(i==n/2&&j==n/2){
                  System.out.print("o");
               }
               else if(i+j>=0&&i+j>=n/2&&i-j>=-n/2&&i-j<=n/2&&i+j<=n+2){
                   System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }
            System.out.println(" "); 
            }
            
    }
}