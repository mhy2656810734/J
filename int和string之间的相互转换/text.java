public class text {
	/** String 转换成 int
	 * 
	 */
	public static void main(String[] args) {
		String str="100";
		int num=Integer.parseInt(str);
		System.out.println(num);
	}




	/** int 转换成string
	 * 
	 */
	public static void main1(String[] args) {
		int num=100;
		//方法1
		//String str1=num+"";
		//System.out.println(str1);
		//方法2
		String str2=String.valueOf(num);
		System.out.println(str2);

	}
}