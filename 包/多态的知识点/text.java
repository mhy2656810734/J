import java.util.Scanner;

/**
 * @author 26568
 *    多态:
 * 一.向上转型
 * 1.父类引用  引用子类的对象
 *  通过向上转型后，通过父类的引用， 只能访问父类有的方法或者属性
 *  二、发生向上转型的时机
 *  1.直接赋值
 *  2.传参
 *  3.返回值
 *  三、运行时绑定（运行时绑定）
 * 父类的引用   引用子类对象  同时，通过父类引用调用同名的重写方法
 * 四、重写和重载的区别
 * 1.重写（覆盖、覆写）
 * 方法名称相同      返回值相同      方法的参数列表相同                      不同的类，继承关系上
 * 2.重载
 * 方法名相同        返回值不做要求  方法的参数列表不同(参数类型+参数的个数)      同一个类中
 * 五、关于重写需要注意的事项：
 * 1.需要重写的方法,不能被final修饰,因为被final修饰以后是密封方法，不可以修改
 * 2.被重写的方法，访问修饰限定符一定不能是私有的
 * 3.被重写的方法，子类的访问修饰限定符大于等于父类的访问修饰限定符
 *  private < default < protected < public
 * 4.被static修饰的方法不能被重写
 * 六、向下转型
 * 关键字instanceof     A instanceof  B  判断A是不是B的一个实例    是的话返回true  否 false
 * 七、多态
 * 多态是一种思想
 * 1.父类引用 引用子类对象
 * 2.父类和子类有同名的重写方法
 * 3.通过父类引用调用这个重写方法的时候。  发生多态
 * @date 2022-05-20 10:46
 */
//class Animal {
//    public String name;
//    protected /*static /*final*/ void eat() {
//        System.out.println(this.name+"Animal:eat()");
//    }
//    public void sleep() {
//        System.out.println("Animal:sleep()");
//    }
//    public Animal(String name) {
//        this.name = name;
//    }
//}
//class Cat extends Animal {
//    public Cat(String name) {
//        super(name);  // 显示调用 必须放到第一行
//    }
//    public int count = 99;
//     protected void eat() {    // 重写方法
//        System.out.println("哈哈哈哈");
//    }
//}
//
//class Bird extends Animal {
//   public Bird(String name) {
//       super(name);
//   }
//   public void fly() {
//       System.out.println("fly");
//   }
//}
//    public class text{
//    public static Animal func() {
//        return new Cat("nimi");// 3.返回值发生向上转型
//    }
//    public static void func(Animal animal) {   // 2.传参发生向上转型
//        animal.eat();
//    }
//    public static void main(String[] args) {
//        Animal animal = new Cat("nimi");  // 1.直接赋值发生向上转型
//        animal.eat();
//        Cat cat = new Cat("mimi");   // 2.传参发生向上转型
//        func(cat);
//        Animal animal = func();  // 3.返回值发生向上转型
//        animal.eat();
//        Animal animal = new Cat("尼米");
//        animal.eat();
//          Animal animal = new Cat("nimi");
//          if ( animal instanceof Bird) {
//              Bird bird = (Bird)animal; // 强制转换
//              bird.fly();
//          } else {
//              System.out.println("错啦");
//          }

//    }
//}

//    多态的代码
class Shape {
    public void draw() {

    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个○");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个❀");
    }
}
class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个□");
    }
}

public class text {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1 = new Flower();
        Shape shape2 = new React();
        Shape shape3 = new Circle();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);
    }
}