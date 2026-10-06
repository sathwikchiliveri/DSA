public class eveoddcountinarr
{
	public static void main(String[] args) {
		int a[]= {1,2,7,8,9,11,12,14};
		int oddcount=0,evencount=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				evencount++;
			} else {
				oddcount++;
			}
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}
}
