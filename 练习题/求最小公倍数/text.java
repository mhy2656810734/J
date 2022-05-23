public class text {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i = 1;
        while ((i*a)%b != 0) {
            i++;
        }
        System.out.println(a*i);
    }
}
