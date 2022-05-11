import java.util.Scanner;
class Person{
    //字段->成员变量
    public String name;//name 和 age 是实例成员变量
    public int age;//各种数字类型默认值是0
    public static String sex;//被static关键字修饰的成员称为静态成员变量   它不属于对象的引用    只属于类Person和实例成员变量
                             //静态成员变量存放在方法区且只有一份
    public static boolean flag;//boolean类型默认值是false   引用类型以及自定义类的默认值都是null
    //方法->行为(操作)
    //eat 和 sleep 是实例方法
    //play 是静态方法
    public void eat() {
        int a = 10;//a是局部变量，存放在栈
        System.out.println("eat()!");
    }
    public void sleep() {
        System.out.println("sleep()!");
    }
    public static void play(){
        System.out.println("play()!");
    }
}
public class text {
    public static void main(String[] args) {
        //实例化一个对象    person是对象的引用
        Person person = new Person();//new Person是以Person为模板，在堆空间上创建一个Person对象   ()是对Person对象进行初始化
        //Person  person创建了一个在栈空间上的对象引用person ，该对象通过”=“ 指向堆空间上创建的Person对象
        //每new一个对象，就会在堆空间上有一份实例成员变量

        //成员变量的引用
        //1.实例成员变量的引用   对象引用.成员变量
        person.age = 18;
        person.name = "马海洋";
        //2.静态成员变量的引用   类名.成员变量
        Person.sex = "男";
        Person.flag = true;
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(Person.sex);
        System.out.println(Person.flag);
        //方法的引用
        //1.实例方法的访问    对象引用.方法
        person.eat();
        person.sleep();

        //2.静态方法的访问    类名.方法
        Person.play();

    }
}