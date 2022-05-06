public class text {
	public static void main(String[] args) {
		int num=5;
		int i=1;
		int j=0;
		int sum=0;
		int ret=1;
		for(j=1;j<=num;j++) {
			while(i<=j) {
				ret*=i;
				i++;
			}
			sum+=ret;
		}
		System.out.println(sum);
	}
}