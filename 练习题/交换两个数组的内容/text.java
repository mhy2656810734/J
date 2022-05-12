import java.util.Arrays;

public class text {
    public static void func(int[] arr1,int[] arr2) {
        for(int i=0;i<arr1.length;i++){
            int tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] =tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {10,9,8,7,6};
        func(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}