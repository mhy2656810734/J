public class text {
    public static double argArr(int[] arr){
        double max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum += arr[i];

        }
        max = (double)sum/(double)arr.length;
        return max;
    }
    /**
     * 数组拷贝
     */
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};

        double max = argArr(array);
        System.out.println(max);
    }

}
