
import java.util.*;
public class Removefirstdigit {
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        int p=1;
        int c=0;
        int temp=n;
        
        while(temp!=0){
            c++;
            temp/=10;
            }
            for(int i=1;i<c;i++){
                p*=10;
            }  
        
    
    if((n/p)<0){
       System.out.println(-(n/p));
            }
              else{
            System.out.println(n/p);
            }
    }
}    
