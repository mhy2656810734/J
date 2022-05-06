public class text {
    /**
     * 计算水仙花数  四叶玫瑰数等
     * @param args
     */
    public static void main(String[] args) {
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