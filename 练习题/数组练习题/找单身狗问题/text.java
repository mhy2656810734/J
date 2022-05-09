import java.util.Arrays;
import java.util.Scanner;

///**
// * @author 26568
// * @date 2022-05-06 19:53
public class text {

    public static void search(int[] arr){
        //先将只出现一次的两个数字分成两组    根据&1得到的数字不同来进行分组
        int[]arr1 = new int[arr.length];//用来存放2 4
        int[]arr2 = new int[arr.length];//用来存放1 3 5
        int n=0;//下标
        int m=0;//下标
        for(int i=0;i<arr.length;i++){
            if((arr[i]&1)==0){
                arr1[n]=arr[i];
                n++;
            }else {
                arr2[m] = arr[i];
                m++;
            }
        }
        int j=0;
        for(int i=0;i<arr1.length;i++){
            j^=arr1[i];
        }
        System.out.println(j);
        j=0;
        for(int i=0;i<arr2.length;i++){
            j^=arr2[i];
        }
        System.out.println(j);

    }
    /**
     * 找两个单身狗问题
     * @param args
     */
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,1,2,3,5};
        search(arr);
    }
}
//    /**
//     * 找一个单身狗   实现思路：异或
//     * @param args
//     */
//    public static void main(String[] args) {
//        int[] arr = new int[]{1,3,5,7,5,3,1};
//        int ret = 0;
//        for(int i=0;i<arr.length;i++){
//            ret^=arr[i];
//        }
//        System.out.println(ret);
//    }
//}