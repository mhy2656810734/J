public class Text {
	/**
	 * boolean 没有规定   只有true和false
	 */
	public static void main(String[] args) {
		boolean flag=true;
		System.out.println(flag);
	}




	/**
	 * double 8个字节
	 * 
	 */
	public static void main7(String[] args) {
		double a=12.3;
		System.out.println(a);
	}




	/**
	 * float: 4个字节
	 */
public static void main6(String[] args) {
	float a=12.3f;
	System.out.println(a);
	System.out.println(Float.MAX_VALUE);
	System.out.println(Float.MIN_VALUE);
}


	/**
	 * long: 8个字节 
	 * 
	 */
	public static void main5(String[] args){
		long a=10L;
		System.out.println(a);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}





	/**
	 * int : 四个字节 
	 */
	public static void main4(String[] args){
		int a=10;
		System.out.println(a);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}




	/**
	 * short: 两个字节
	 * 
	 */
	public static void main3(String[] args){
		short b=10;
		System.out.println(b);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}




	/**
	 * char :两个字节 
	 *
	 */

public static void main2(String[] args){
	char ch='A';
	char ch1='海';
	System.out.println(ch);
	System.out.println(ch1);
}


	/**
	 * 字节:byte  1个字节  数值 -128 ——127 
	 */
	public static void main1(String[] args){
		byte b=10;
		byte c=12;
		System.out.println(b+" "+c);
		System.out.println(b);
	}
}