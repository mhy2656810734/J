class Student{
    //访问修饰限定符
    //1.public： 公有的  只能在该类中使用
    //2.private  私有的
    //3.protected 受保护的
    //4.什么都不写  默认->包访问权限
   private String name;
   public int age;

   //提供一个公开的接口
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        //this. 当前对象的引用
        this.name = name;
    }
}
public class text{
    public static void main(String[] args) {
        //实例化一个对象
        Student student = new Student();
        student.setName("马海洋");
        System.out.println(student.getName());
    }
}