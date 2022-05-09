public class text {
    public static int baniarySearch(int[] arr, int key) {
        int left = 0;
        boolean flag = false;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) >>>1;
            if (key < arr[mid]) {
                right = mid - 1;
            } else if (key > arr[mid]) {
                left = mid + 1;
            } else {
               return mid;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
        int ret = baniarySearch(array,key);
        if(ret!=-1){
            System.out.println("找到了，下标是:"+ret);
        } else {
            System.out.println("找不到");
        }

    }

}