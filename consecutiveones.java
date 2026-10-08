import java.util.*;
public class consecutiveones {
    public static void main(String []args){ 
    int a[]={1,1,0,0,1,1,1,0,1,0};
     int c[]=new int [a.length];
    int count=0;
     for(int i=0;i<a.length;i++){
    if(a[i]==1){
        count++;
    }else {
        count=0;
    }
    for(int j=0;j<count;i++){
         c[j]=count;
          
// System.out.print(c[j]); 
}

     }
     System.out.print(Arrays.toString(c)); 
     }  
  }

