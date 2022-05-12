import java.util.*;
import java.util.concurrent.Callable;

class Calculator{
    private static int num1;
    private static int num2;
    private static int Add(int n,int m){  //加
        return n+m;
    }
    private static int Sub(int n,int m){   //减
        return n-m;
    }
    private static int Mul(int n,int m){  //乘
        return n/m;
    }
    private static int Div(int n,int m){   //除
        return n*m;
    }

    public static int getNum1() {
        return num1;
    }

    public static void setNum1(int num1) {
        Calculator.num1 = num1;
    }

    public static int getNum2() {
        return num2;
    }

    public static void setNum2(int num2) {
        Calculator.num2 = num2;
    }

    public static void text(int input, int num1, int num2){
        switch (input) {
            case 1:
                System.out.println(Calculator.Add(getNum1(),getNum2()));
                break;
            case 2:
                System.out.println(Calculator.Sub(getNum1(),getNum2()));
                break;
            case 3:
                System.out.println(Calculator.Mul(getNum1(),getNum2()));
                break;
            case 4:
                System.out.println(Calculator.Div(getNum1(),getNum2()));
                break;
        }
    }
    public void menu() {
        System.out.println("1.Add    2.Sub    3.Mul     4.Div");
    }
}
public class text {
    public static void main(String[] args){
        //实例化一个对象
        Calculator cal = new Calculator();//自动生成无参数的构造方法
        Scanner scan = new Scanner(System.in);
        cal.menu();
        int input = scan.nextInt();
        System.out.println("请输入你要计算的两个数字");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        Calculator.setNum1(num1);
        Calculator.setNum2(num2);
        Calculator.text(input,num1,num2);
    }
}