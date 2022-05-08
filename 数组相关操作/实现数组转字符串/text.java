
import java.util.Arrays;

///**
// * @author 26568
// * @date 2022-05-06 19:53
public class text {
    /**
     * 数组转字符串
     * @param args
     */

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(toString(array));
    }
    public static String toString(int[] arr){
        String ret="[";
        for(int i=0;i<arr.length;i++){
            ret+=arr[i];
            if(i!=arr.length-1){
                ret+=", ";
            }
        }
        ret += "]";
        return ret;
    }
}

