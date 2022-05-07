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

