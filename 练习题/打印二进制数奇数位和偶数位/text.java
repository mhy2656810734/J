public class text {
    /**
     * 打印二进制数的奇数位和偶数位
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=0;
        //打印偶数位
        System.out.println("偶数位：");
        for(i=31;i>=1;i-=2){
            System.out.print(((n>>i)&1)+" ");
        }
        System.out.println();//换行
        System.out.println("奇数位:");
        for(i=30;i>=0;i-=2){
            System.out.print(((n>>i)&1)+" ");
        }
    }
}