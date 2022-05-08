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