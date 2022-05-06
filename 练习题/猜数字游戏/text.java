import java.util.Scanner;
import java.util.Random;
//import java.*;
public class text {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random=new Random();
		int randNum=random.nextInt(100);//0到99
				while(true){
			System.out.println("开始游戏,请输入数字");
			int input=scan.nextInt();
			if(input<randNum){
				System.out.println("猜小了");
			}else if(input==randNum){
				System.out.println("猜对啦！");
				break;
			}else{
				System.out.println("猜大了");
			}
		}
	}
}