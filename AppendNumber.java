
public class AppendNumber{
    public static void main(String[] args) { 
        int n =1234;
        int r=77;
        int k=r;
        int count=0;
        while(r>0){
              
            count++;
            r=r/10;
            }

        for(int i=0;i<count;i++){
            n=n*10;
        }
        int o=n+k;
        System.out.println(o);
     
    }
    
}