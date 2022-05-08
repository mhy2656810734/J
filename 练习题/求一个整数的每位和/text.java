public class text {
    public static int sum(int x) {
        if (x < 10) {
            return x;
        }
        return x % 10 + sum(x / 10);
    }

    public static void main(String[] args) {
        int ret = sum(1729);
        System.out.println(ret);
    }
}
}