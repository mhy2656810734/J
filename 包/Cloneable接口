package demo3;

import java.util.Arrays;

/**
 * @author 26568
 *  Cloneable 接口
 * @date 2022-05-29 17:15
 */
class Money implements Cloneable {
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable {
    public int age;
    Money m = new Money();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        // 克隆person
        Person p = (Person)super.clone();// 拷贝
        // 克隆当前的Money对象
        p.m = (Money)this.m.clone();
        return p;
    }
}
public class TextDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        // 深拷贝
//        int[] arr = {1,2,3,4,5,6};
//        int[] arr1 = arr.clone();
//        arr1[0] = 99;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr1));
        // 深拷贝
//        Person person1 = new Person();
//        Person person2 = (Person)person1.clone();
//        System.out.println(person1.age);
//        System.out.println(person2.age);
//        person2.age = 18;
//        System.out.println("----------修改后-----------");
//        System.out.println(person1.age);
//        System.out.println(person2.age);
        // 浅拷贝
        // protected Object clone() throws CloneNotSupportedException {
        //        return super.clone();
        //    }
//        Person person1 = new Person();
//        Person person2 = (Person)person1.clone();
//        System.out.println(person1.m.money);
//        System.out.println(person2.m.money);
//        person2.m.money = 99.5;
//        System.out.println("----------修改后-----------");
//        System.out.println(person1.m.money);
//        System.out.println(person2.m.money);
        // 深拷贝(Money的对象也需要拷贝一份，所以Money也标记为可拷贝)
        // protected Object clone() throws CloneNotSupportedException {
        //        //return super.clone();
                 // 克隆person
        //        Person p = (Person)super.clone();// 拷贝
                 // 克隆当前的Money对象
        //        p.m = (Money)this.m.clone();
        //        return p;
        //    }
        Person person1 = new Person();
        Person person2 = (Person)person1.clone();

        System.out.println(person1.m.money);
        System.out.println(person2.m.money);

        person2.m.money = 99.5;
        System.out.println("----------修改后-----------");

        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
    }
}
