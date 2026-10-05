class Main{
public static void main(String []args){
    int []a={10,777,9999,1};

    for(int i=0;i<a.length;i++){
        int  n=a[i];
        int count=0;
    while(n!=0){
           int ld=n%10;
            count++;
            n/=10;
        }
        System.out.print(count+" ");
    }
}
}