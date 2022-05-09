import java.util.Arrays;

///**
// * @author 26568
// * @date 2022-05-06 19:53
public class text {
    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array={6,8,2,3,1,5,7,4};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

}