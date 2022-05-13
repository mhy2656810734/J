import java.util.Arrays;

class MyArrayList {
    public int[] elem;// 数组
    public int usedSize;// 有效数据个数
    public static final int intCapacity = 10;// 容量

    // 构造方法 为类赋初值
    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }
    //检查容量
    private boolean isFull() {
//        if(this.usedSize==this.elem.length){
//            return true;
//        }
//        return false;
        return this.usedSize == this.elem.length;
    }
    // 检查pos位置合法性
    private void checkPos(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
    }
    // 在pos位置插入数据
    public void add(int pos, int data) {
        // 检查容量
        if(isFull()){
            this.elem =
                    Arrays.copyOf(this.elem,2*this.elem.length);
        }
        checkPos(pos);
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    // 打印顺序表
    public void display() {
        for(int i=0;i<this.usedSize;i++) {
            System.out.print(this.elem[i]+" ");
        }
//        System.out.println(Arrays.toString(this.elem));
        System.out.println();
    }
    // 查找数据是否存在
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(toFind==this.elem[i]){
                return true;
            }
        }
        return false;
    }
    // 返回数据的下标
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(toFind==this.elem[i]){
                return i;
            }
        }
        return -1;
    }
    //判空
    private boolean isEmpty() {
        return this.usedSize == 0;
    }
    // 返回pos位置的元素
    public int getPos(int pos) {
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空!");
        }
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
        return this.elem[pos];
    }
    // 求顺序表长度
    public int size(){
        return this.usedSize;
    }
    // 删除第一次出现的关键字toRemove
    public void remove(int toRemove) {
       int index = search(toRemove);
       if(index == -1) {
           return;
       } else {
           for(int i=index;i<this.usedSize-1;i++){
               this.elem[i] = this.elem[i+1];
           }
       }
        this.usedSize--;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }
    // 修改数据
    public void setPos(int pos,int data) {
        checkPos(pos);
        this.elem[pos] = data;
    }
}
public class text {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        for(int i=0;i<10;i++) {
            myArrayList.add(i,i);
        }
          if(myArrayList.contains(8)){
              System.out.println("存在");
          } else {
              System.out.println("不存在");
          }
        //myArrayList.remove(0);
        System.out.println("下标为："+myArrayList.search(8));
        System.out.println("长度为："+myArrayList.size());
        System.out.println(myArrayList.getPos(0));
        myArrayList.setPos(4,20);
        myArrayList.display();
        System.out.println("=========");
        myArrayList.clear();
        myArrayList.display();
    }
}