public class Integertobin{
public static void main(String []args){
    int a[]={10,2,5,6,8,246};
    int n;
    for(int i=0;i<a.length;i++){
        n=a[i];
        int binary=0;
        int place=1;
        while(n>0){
        int rem=n%2;
        binary=rem*place+binary;
        n/=2;
    }

    System.out.print(binary+" ");
}    
}
}
