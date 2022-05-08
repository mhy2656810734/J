
import java.util.Arrays;

///**
// * @author 26568
// * @date 2022-05-06 19:53
public class text {
    /**
     * 数组拷贝
     */
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
       int[] ret = copyArray(array);
        System.out.println(Arrays.toString(ret));

    }
    public static int[] copyArray(int[] array){
        int[] ret = new int[array.length];
        for(int i=0;i< array.length;i++){
            ret[i] = array[i];
        }
        return ret;
    }
}

