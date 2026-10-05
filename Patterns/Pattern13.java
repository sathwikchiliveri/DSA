package patterns;
public class Pattern13 {
    public static void main(String []args){
        int n = 6;
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(i+j>=n-1){
          System.out.print(j - ((n - 3 - i) + 1) +"  ");
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