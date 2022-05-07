import java.util.Scanner;

///**
// * @author 26568
// * @date 2022-05-06 19:53
public class text {
    /**
     * 判断2进制数字1的个数
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        System.out.println(count);
    }





    /**
     * 计算水仙花数  四叶玫瑰数等
     * @param args
     */
    public static void main1(String[] args) {
        int i=0;
        for(i=1;i<=999999;i++) {
            int count=0;//计算数字的位数
            int tmp=i;
            int sum=0;
            //计算位数
            while(tmp!=0){
                count++;
                tmp/=10;
            }
            tmp=i;
            while(tmp!=0){
                sum+=Math.pow(tmp%10,count);
                tmp/=10;
            }
            if(sum==i){
                System.out.println(sum+" is my result");
            }
        }

    }
}
//    /**
//     * 计算0-100中的数字9出现的次数
//     * @param args
//     */
//    public static void main(String[] args) {
//        int i=0;
//        int count=0;
//        for(i=0;i<=100;i++){
//            if(i%10==9){
//                count++;
//            }
//            if(i/10==9){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
//public class text {
//    /**
//     * 计算0-100中的包含数字9的数字的个数
//     * @param args
//     */
//    public static void main(String[] args) {
//        int i=0;
//        int count=0;
//        for(i=0;i<=100;i++){
//            if(i%10==9){
//                count++;
//            }else if(i/10==9){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}