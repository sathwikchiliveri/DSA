public class primeornot {

	public static void main(String []args) {
		int a[]= {1,2,3,5,12,9};
		for(int i=0; i<a.length; i++) {
			int n=a[i];
			int flag=1;
			if(n==1)
			{
				flag=0;
				a[i]=flag;
			}
			else
			{
				for(int j=2; j<n; j++)
				{
					if(n%j==0)
					{
						flag=0;
						break;
                      }
				}
				a[i]=flag;
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}