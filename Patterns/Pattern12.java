package patterns;
public class Pattern12 {
    public static void main(String []args){
        int n = 6;
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(i+j>=n){
          System.out.print(i+"  ");
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
