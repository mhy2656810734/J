class Student{
    //访问修饰限定符
    //1.public： 公有的  只能在该类中使用
    //2.private  私有的
    //3.protected 受保护的
    //4.什么都不写  默认->包访问权限
   private String name;
   public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//提供一个公开的接口
//    public String getName() {
//        return this.name;
//    }
//    public void setName(String name){
//        //this. 当前对象的引用
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名='" + name + '\'' + //也可以将name 和 age改成姓名。。。年龄.....
                ", 年龄=" + age +
                '}';
    }
}

public class text{
    public static void main(String[] args) {
        //实例化一个对象
        Student student = new Student();
        student.age = 18;
        student.setName("帅哥");
        //两种打印方式
        //1.
        System.out.println(student);
        System.out.println(student.age);
        //2.
        System.out.println(student.getName());
    }
}