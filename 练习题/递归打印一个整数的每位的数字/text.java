public class text {
    public static void func(int n){
        if(n>10){
            func(n/10);
        }
        System.out.println(n%10);
    }

    public static void main(String[] args) {
        func(123);
    }
}