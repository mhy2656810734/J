package com.bit.demo1;
// 2.创建的包，要在前面加上包的路径

/**
 * @author 26568
 * 包相关知识
 * 1.包名小写   倒着写：com.bit.demo1    包下有很多类，但是不是一次性加载进来，使用到谁用谁
 * 3.继承：A extends B   A:子类  派生类  B：父类、基类、超类     继承的优点：可以达到代码的复用效果    is a  的关系
 *   子类继承了父类除了构造方法的所有    一个子类只能继承一个父类    父类的private成员和方法子类可以继承，但是无法访问
 *   子类在构造的时候，要先帮父类进行构造
 *  4.this（当前对象的引用）和 super(代表父类对象的引用)的区别
 *   this(); 调用本类的其他构造方法  this.data; 调用本类的成员变量   this.func(); 调用本类的其他的成员方法
 *   super();调用父类的构造方法(第一行)   super.data;访问父类的属性  super.func();访问父类的成员方法
 *   5.final 关键字
 *   final int capacit = 10; 初始化一次不能被修改
 *   final 类      final  修饰类  表示类不能再被继承
 *   6.四种访问修饰限定符
 *   private  只能访问同一个包中的同一类
 *   default 缺省包 可以访问同一个包的同一个类或者不同类
 *   protected 可以访问同一个包中得同一个类或者不同类  也可以访问不同包的子类
 *   public 可以访问所有（包括不同包的非子类）
 *   7.多重继承
 *   一般不超过三层
 * @date 2022-05-19 9:05
 */

// final class Animal 不能再被继承
class Animal {
    public String name;
    public void eat() {
        System.out.println(this.name+"Animal:eat()");
    }
    public void sleep() {
        System.out.println("Animal:sleep()");
    }
    public Animal(String name) {
        this.name = name;
    }
}
 class Cat extends Animal {
    public Cat(String name) {
        super(name);  // 显示调用 必须放到第一行
    }
    }
class MiMi extends Cat {
    public MiMi(String name) {
        super(name);
    }
    }
public class TextDemo {
    public static void main(String[] args) {
//        Cat cat = new Cat("mimi");
//        cat.eat();
        MiMi mimi = new MiMi("maomao");
        mimi.eat();
    }
}
