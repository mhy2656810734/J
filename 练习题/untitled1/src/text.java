public class text {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.display();
//        System.out.println(myLinkedList.search(5));
//        System.out.println(myLinkedList.size());
//        myLinkedList.addIndex(5,35);
//        myLinkedList.display();
//        myLinkedList.remove(4);
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(1);
        myLinkedList.addLast(3);
        myLinkedList.addLast(1);
        myLinkedList.addLast(4);
        myLinkedList.addLast(1);
        myLinkedList.addLast(5);
        myLinkedList.addLast(1);
        myLinkedList.display();
        myLinkedList.removeAllKey(1);
        myLinkedList.display();
    }
}