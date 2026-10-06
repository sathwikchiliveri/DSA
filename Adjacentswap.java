import java.util.Arrays;
public class Adjacentswap {
  public static void main(String []args){
    int a[]={1,3,5,7,9,10};

int temp;
     for(int i=0;i<a.length-1;i=+2){
        temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
     
    }
  System.out.println(Arrays.toString(a));
  }
    

}
