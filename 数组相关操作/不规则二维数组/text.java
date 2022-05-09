import java.util.Arrays;

///**
// * @author 26568
// * @date 2022-05-06 19:53
public class text {
    public static void main(String[] args) {
        int[] [] arr = new int[2][];
        arr[0] = new int[]{1,2,3};//初始化第一行
        arr[1] = new int[]{4,5};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}