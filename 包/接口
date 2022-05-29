import java.util.Arrays;

/**
 * @author 26568
 * // 一、接口  interface
 * // 1.接口中的方法都是抽象方法
 * // 2.可以有具体实现的方法，这个方法是被default修饰的
 * // 3.接口当中定义的成员变量，默认是常量
 * // 4.接口当中默认的成员变量是：public static final   成员方法是：public abstract
 * // 5.接口不可以被实例化
 * // 6.接口和类之间的关系     类  implements  接口
 * // 7.为了解决java单继承的问题(一个子类只能继承一个父类), 可以实现多个接口
 * // 8.只要一个类实现一个该接口，就可以进行向上转型
 * 二、Comparable 接口
 * 比较自定义类型的大小时使用
 * @date 2022-05-28 11:56
 */
//class Animal {
//    protected String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }
//}
//interface IFlying {
//        void fly();
//}
//interface ISwimming {
//        void swim();
//}
//interface IRuning {
//        void run();
//}
//class Fish extends Animal implements ISwimming {
//        public Fish (String name) {
//            super(name);
//        }
//
//    @Override
//    public void swim() {
//        System.out.println(this.name+"正在用尾巴游");
//    }
//}
//class Dog extends Animal implements IRuning {
//        public Dog(String name) {
//            super(name);
//        }
//        public void run() {
//            System.out.println(this.name+"正在跑");
//        }
//}
//class Frog extends Animal implements ISwimming,IRuning {
//        public Frog(String name) {
//            super(name);
//        }
//
//    @Override
//    public void swim() {
//        System.out.println(this.name+"正在游");
//    }
//
//    @Override
//    public void run() {
//        System.out.println(this.name+"正在跑");
//    }
//}

    class Student implements Comparable<Student>{
        public String name;
        public int age;
        public int score;
        public Student(String name,int age,int score) {
            this.name = name;
            this.age = age;
            this.score = score;
        }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
       if (this.score < o.score) {
           return 1;
       } else if (this.score > o.score) {
           return -1;
       } else {
           return 0;
       }
    }
}

public class text {
//    public static void func(IRuning run) {
//        run.run();
//    }
    public static void main(String[] args) {
//        Dog dog = new Dog("小狗");
//        func(dog);
//        int[] array = {10,8,7,13,20,29};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        Student student1 = new Student("海洋",20,99);
        Student student2 = new Student("布仁",99,10);
        Student student3 = new Student("马萍",18,100);
        Student[] student = new Student[3];
//        if(student1.compareTo(student2) < 0) {
//            System.out.println(student1.name+"的年龄小于"+student2.name );
//        }
        student[0] = student1;
        student[1] = student2;
        student[2] = student3;
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));
    }
}
