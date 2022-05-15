import java.util.Scanner;
public class text {
	/**
	 * 判断闰年
	 */
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 // 退出循环使用场景  OJ  笔试的环境
	 //1.ctr+c(直接中断程序)
	 //2.ctr+D(正常退出)
	 while(scan.hasNextInt()) {
	 	int year =scan.nextInt();
	 	if((year%4==0 && year%100!=0) || (year%400==0)){
	 		System.out.println("是闰年");
	 	}else {

	 		System.out.println("不是闰年");
	 		}

	 }
	}
}
