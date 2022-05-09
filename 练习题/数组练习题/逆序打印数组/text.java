import java.util.Arrays;

///**
// * @author 26568
// * @date 2022-05-06 19:53
public class text {
    public static void reverseArray(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] array={6,8,2,3,1,5,7};
        reverseArray(array);
        System.out.println(Arrays.toString(array));

    }

}