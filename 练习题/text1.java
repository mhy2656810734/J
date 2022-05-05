public class text1 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int max=a;
		int min=a;
		if(max<b) {
			int tmp=max;
			max=b;
			b=tmp;
		} else if(min>b) {
			int tmp=min;
			min=b;
			b=tmp;
		} if(max<c) {
			int tmp=max;
			max=c;
			c=tmp;
		} else if (min>c) {
			int tmp=min;
			min=c;
			c=tmp;
		}

		System.out.println("最大值是"+max);
		System.out.println("最小值是"+min);
	}
}