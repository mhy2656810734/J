class Person {

    private String name;
    public int age;
    public Person() {   //构造方法
        this("张飞",18);
        System.out.println("好好学习");
    }
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
        //System.out.println("天天向上");
    }
    {
        System.out.println("实例代码块");
    }                                              //执行顺序，静态代码块   实例代码块
    static {   //不能访问非静态的数据成员               //静态的内容，先定义先执行
        System.out.println("静态代码块");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class text{
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("======================");
        Person person2 = new Person();
//        System.out.println(person1);
//        Person person2 = new Person("张飞",18);
//        System.out.println(person2);
    }
}