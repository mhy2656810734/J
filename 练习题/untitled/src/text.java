/**
 * @author 26568
 * @date 2022-05-06 19:53
 */
//public class text {
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
public class text {
    /**
     * 计算0-100中的包含数字9的数字的个数
     * @param args
     */
    public static void main(String[] args) {
        int i=0;
        int count=0;
        for(i=0;i<=100;i++){
            if(i%10==9){
                count++;
            }else if(i/10==9){
                count++;
            }
        }
        System.out.println(count);
    }
}