// 结点
class Node {
    public int data; // 数据域
    public Node next;// 前驱指针
    public Node prev;// 后继指针
    public Node (int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;// 头结点
    public Node tail;// 尾结点
    // 头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
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
    // 查询数据
    public boolean contains(int data) {
        if (this.head == null) {
            throw new RuntimeException("链表为空");
        }
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == data) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    // 检查index的合法性
    private void checkIndex(int index) {
        if ((index < 0)||(index > this.size())) {
            throw new RuntimeException("index位置不合法");
        }
    }
    private Node searchIndex(int index) {
        Node cur = this.head;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    public void addIndex(int index,int data) {
        checkIndex(index);
        // 如果是头插
        if (index == 0) {
            this.addFirst(data);
            return;
        }
        // 如果是尾插
        if (index == this.size()) {
            this.addLast(data);
            return;
        }
        // 此时cur的位置就是要插入的位置
        Node node = new Node(data);
        Node cur = searchIndex(index);
        cur.prev.next = node;
        node.prev = cur.prev;
        node.next = cur;
        cur.prev = node;
    }
    // 删除第一次出现的关键字key
    public void remove(int key) {
        Node cur = this.head;
        while (cur != null) {
            // 判断是否为头结点
            if (cur.data == key) {
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                    return;
                }
                cur.prev.next = cur.next;
                if (cur.next != null) {
                    cur.next.prev = cur.prev;
                } else {
                    this.tail = cur.prev;
                }
            }
            cur = cur.next;
        }
    }
    // 删除所有关键字key
    public void removeAllkey(int key) {
        Node cur = this.head;
        while (cur != null) {
            // 判断是否为头结点
            if (cur.data == key) {
                if (cur == this.head) {
                    this.head = this.head.next;
                    if (this.head != null) {
                        this.head.prev = null;
                    }
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
    // 清除链表
    public void clear() {
        while (this.head != null) {
            Node cur = this.head;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
        this.tail = null;
    }
}