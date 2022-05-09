import java.util.Arrays;

///**
// * @author 26568
// * @date 2022-05-06 19:53
public class text {
    /**
     * 二维数组的三种定义方式以及打印二维数组
     * @param args
     */
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
//        int[][] arr3 = new int[2][3];
//        int[][] arr2= new int[][]{{1,2,3},{4,5,6}};
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print((arr[i][j]+" "));
//            }
//            System.out.println();
//        }
        for (int[] tmp:arr) {
            for (int x:tmp) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}import java.util.Arrays;

///**
// * @author 26568
// * @date 2022-05-06 19:53
public class text {
    /**
     * 二维数组的三种定义方式以及打印二维数组
     * @param args
     */
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6}};
//        int[][] arr3 = new int[2][3];
//        int[][] arr2= new int[][]{{1,2,3},{4,5,6}};
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print((arr[i][j]+" "));
//            }
//            System.out.println();
//        }
        for (int[] tmp:arr) {
            for (int x:tmp) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}