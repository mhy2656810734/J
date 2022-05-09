import java.util.Arrays;

///**
// * @author 26568
// * @date 2022-05-06 19:53
public class text {
  public static boolean isUp(int[] arr){
      int ret=arr[0];
      for(int i=1;i<arr.length;i++){
          if(ret<arr[i]){
             ret=arr[i];
          }else if(ret>arr[i]){
              return false;
          }
      }
      return true;
  }
    public static void main(String[] args) {
        int[] array={1,3,5,6};
        System.out.println(isUp(array));

    }

}