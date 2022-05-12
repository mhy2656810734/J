import java.lang.invoke.MutableCallSite;

class MyValue {
    //public int val;
    private int val;
    public int getVal() {
        return this.val;
    }
    public void setVal(int val) {
        this .val = val;
    }
    //交换方法
    public static void swap(MyValue myValue1,MyValue myValue2 ) {
//        int tmp = myValue1.val;
//        myValue1.val = myValue2.val;
//        myValue2.val = tmp;
          int tmp = myValue1.val;
          myValue1.setVal(myValue2.getVal());
          myValue2.setVal(tmp);
    }
}

public class text {
    /**
     * 交换两个变量的值，要求交换实参的值
     * @param args
     */
    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        MyValue myValue2 = new MyValue();
//        myValue2.val = 20;
//        myValue1.val = 10;
//        System.out.println(myValue1.val);
//        System.out.println(myValue2.val);
//        MyValue.swap(myValue1,myValue2);
//        System.out.println("交换后");
//        System.out.println(myValue1.val);
//        System.out.println(myValue2.val);
         myValue1.setVal(10);
         myValue2.setVal(20);

        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
        System.out.println("交换后");
        MyValue.swap(myValue1,myValue2);
        System.out.println(myValue1.getVal());
        System.out.println(myValue2.getVal());
    }
}