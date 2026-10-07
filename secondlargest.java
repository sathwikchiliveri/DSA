public class secondlargest {
  
    public static void main(String[] args) {
       int  a[]={10,20,15,35};
       int largest =a[0];
       int s_largest=0;
       for(int i=1;i<a.length;i++){
        if (largest<a[i]){
            s_largest=largest;
        largest=a[i];
        }else if(s_largest<a[i]&&a[i]!=largest){
            s_largest=a[i];
        }   

        }
        System.out.println(s_largest);
        
    }
}  
