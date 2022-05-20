/**
 * @author 26568
 * 双向链表
 * @date 2022-05-19 20:34
 */
class Node {
    public int data;
    public Node next;
    public Node prev;
    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;// 头结点
    public Node tail; // 尾结点
    // 头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        // 判断是否是第一次插入
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }
    // 打印
    public void display() {
        if (this.head == null) {
            throw new RuntimeException("链表为空");
        }
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    // 尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }
    // 查询数据
    public boolean search(int data) {
        if (this.head == null) {
            throw new RuntimeException("链表为空");
        }
        Node cur = this.head;
        while(cur != null) {
            if (cur.data == data) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    // 求链表元素个数
    public int size() {
        if (this.head == null) {
            throw new RuntimeException("链表为空");
        }
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    // 检查index的合法性
    public void checkIndex(int index) {
        if (index<0 || index>this.size()) {
            throw new RuntimeException("index位置不合法");
        }
    }
    // 查找index位置的结点
    public Node searchIndex(int index) {
        Node cur = this.head;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    // 在index的位置前插入
    public void addIndex(int index,int data) {
        checkIndex(index);
        // 头插
        if (index == 0) {
            this.addFirst(data);
        } else if (index == this.size()) {
            this.addLast(data);
        } else {
            // 找到index位置的当前结点
            Node cur = searchIndex(index);
            Node node = new Node(data);
            node.next = cur;
            node.prev = cur.prev;
            cur.prev.next = node;
            cur.prev = node;
        }
    }
    // 删除第一次出现的关键字key
    public void delete(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                // 先判断是不是头结点
                if (cur == this.head) {
                    this.head = this.head.next;
                    break;
                }
                if (cur == this.tail) {
                    this.tail = cur.prev;
                    this.tail.next = null;
                    break;
                }
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
                return;

            } else {
                cur = cur.next;
            }
        }
    }
    // 删除所有出现的关键字key
    public void deleteAllKey(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                // 先判断是不是头结点
                if (cur == this.head) {
                    this.head = this.head.next;

                } else if (cur == this.tail) {
                    this.tail = cur.prev;
                    this.tail.next = null;
                    break;
                } else {

                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;

                }
            }
                cur = cur.next;

        }
    }
}
