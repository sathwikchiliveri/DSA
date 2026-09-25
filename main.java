import java.util.*;
public class main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
 final int n=sc.nextInt();
	int s=sc.nextInt();
    int p=1;	
	//2 power calculator
	for(int i=1;i<=s;i++){
	    p*=2;
	}
   	int LS=n*p;
   	int RS=n/p;
   	
	 System.out.println("left shift:"+LS);
	 System.out.println("Right shift:"+RS);
	}
}
