package patterns;
public class Pattern4 {
    public static void main(String []args){
        int n = 7;
      
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if((i-j>=0)&&(i+j<n)){
          System.out.print((char)('D'-j));
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
