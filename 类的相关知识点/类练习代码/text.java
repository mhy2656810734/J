class Demo{
    public int a;
    public static int count;
}
public class text{
    public static void main(String[] args) {
        //实例化一个对象
        Demo t1 = new Demo();
        t1.a++;
        Demo.count++;
        System.out.println(t1.a);
        System.out.println( Demo.count);
        Demo t2 = new  Demo();
        t2.a++;
        Demo.count++;
        System.out.println(t2.a);
        System.out.println( Demo.count);
    }
}