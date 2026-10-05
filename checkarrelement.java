import java.util.Scanner;
public class checkarrelement
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]={10,20,30,40,30};
		System.out.print("Enter a number to find ");
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++){
		if(arr[i]==n){
		    System.out.println("found at index"+i);
		    return;
		}else{
		    System.out.println("not found");
		}
	}
	sc.close();
  }
}
