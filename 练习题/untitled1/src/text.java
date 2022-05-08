import java.util.Scanner;

///**
// * @author 26568
// * @date 2022-05-06 19:53
public class text {
    //循环实现斐波那契数列
    public static int fabonaci(int n){
        if(n<=2){
            return 1;
        }else{
            int a=1;
            int b=1;
            int c=0;
            for(int i=3;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        int ret = fabonaci(5);
        System.out.println(ret);
    }
}
    /**
     * 递归求每个数字每位之和
     */
//    public static int sum(int x) {
//        if (x < 10) {
//            return x;
//        }
//        return x % 10 + sum(x / 10);
//    }
//
//    public static void main(String[] args) {
//        int ret = sum(1729);
//        System.out.println(ret);
//    }
//}

    /**
     * 递归求1+2+3+4+5
     */
//    public static int sum(int n){
//        if(n!=1){
//            return n+sum(n-1);
//        }
//        return 1;
//    }
//    public static void main(String[] args) {
//
//        int ret = sum(5);
//        System.out.println(ret);
//    }

//    public static int add(int x,int y){
//        return x+y;
//    }
//    public static int add(int x,int y,int z){
//        return x+y+z;
//    }
//    public static double add(double x,int y){
//        return x+y;
//    }
//    public static void main(String[] args) {
//        int ret1=add(1,2);
//        int ret2=add(1,2,3);
//        double ret3=add(2.5,1);
//        System.out.println(ret1);
//        System.out.println(ret2);
//        System.out.println(ret3);
//    }
//}

//    public static int maxNum(int a,int b,int c){
//        a=a>b?a:b;
//        a=a>c?a:c;
//        return a;
//    }
//
//    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        int c=30;
//        int ret=maxNum(10,20,30);
//        System.out.println(ret);
//    }


//    /**
//     * 打印二进制数的奇数位和偶数位
//     * @param args
//     */
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int i=0;
//        //打印偶数位
//        System.out.println("偶数位：");
//        for(i=31;i>=1;i-=2){
//            System.out.print(((n>>i)&1)+" ");
//        }
//        System.out.println();//换行
//        System.out.println("奇数位:");
//        for(i=30;i>=0;i-=2){
//            System.out.print(((n>>i)&1)+" ");
//        }
//    }
//}
//    /**
//     * 判断2进制数字1的个数
//     * @param args
//     */
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n=scan.nextInt();
//        int count=0;
//        while(n!=0){
//            count++;
//            n=n&(n-1);
//        }
//        System.out.println(count);
//    }





//    /**
//     * 计算水仙花数  四叶玫瑰数等
//     * @param args
//     */
//    public static void main1(String[] args) {
//        int i=0;
//        for(i=1;i<=999999;i++) {
//            int count=0;//计算数字的位数
//            int tmp=i;
//            int sum=0;
//            //计算位数
//            while(tmp!=0){
//                count++;
//                tmp/=10;
//            }
//            tmp=i;
//            while(tmp!=0){
//                sum+=Math.pow(tmp%10,count);
//                tmp/=10;
//            }
//            if(sum==i){
//                System.out.println(sum+" is my result");
//            }
//        }
//
//    }
//}
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