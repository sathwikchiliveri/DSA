public class elementstobinary {
public static void main(String []args){
    int a[]={10,2,5,6,8,246};
    int n;
    for(int i=0;i<a.length;i++){
        n=a[i];
         String bits=Integer.toBinaryString(n);
         System.out.print(bits+" ");

    }
}    
}
