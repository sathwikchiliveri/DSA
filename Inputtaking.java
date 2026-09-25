
import java.util.*;

class Inputtaking{
    public static void main(String []args){

    Scanner sc = new Scanner(System.in);
   // int n=sc.nextInt();
    //char c=sc.next().charAt(0);
    //String s=sc.next();
    //sc.close();
    //System.out.println(n);
    //System.out.println(c);
    //System.out.println(s);
/*nt n=sc.nextInt();

System.out.println(n);
    int [] a =new int[n]; 
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    System.out.println("stored" +a[i]);
}
sc.close();*/
String s= sc.nextLine();
//System.out.println(s);
String arr[]=s.split(" ");
//System.out.println(Arrays.toString(arr));
int []integerarr = new int [arr.length];
for(int i=0; i<arr.length;i++){
    integerarr[i]=Integer.parseInt(arr[i]);
}
System.out.println(Arrays.toString(integerarr));
 }
}