import java.util.Scanner;

/**
 * @author 26568
 * @date 2022-05-06 20:14
 */
public class text1 {
    /**
     * 辗转相除法求最大公约数
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c=b;
        while(a%b!=0){
            c=a%b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}
