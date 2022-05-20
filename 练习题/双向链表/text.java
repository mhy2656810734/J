/**
 * @author 26568
 * @date 2022-05-20 10:46
 */
public class text {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(1);
        myLinkedList.display();
//        System.out.println(myLinkedList.search(6));
//        System.out.println(myLinkedList.size());
//        myLinkedList.addIndex(3,20);
//        myLinkedList.display();
        myLinkedList.deleteAllKey(1);
        myLinkedList.display();
    }
}
