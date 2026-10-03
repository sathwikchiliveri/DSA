package patterns;
public class Pattern8
{
	public static void main(String[] args) {
		int n=7;
		for(int i=0;i<=n;i++){
		    for(int j=0;j<n;j++){
		        if(i<=j&&i+j>=n-1){
		        System.out.print(j-3);
		        }
		        else{
		            System.out.print(" ");
		        }
		}
	    System.out.println(" ");
	}
  }
}