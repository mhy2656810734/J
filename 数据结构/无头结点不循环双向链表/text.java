public class text {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        for(int i=0;i<10;i++) {
            myLinkedList.addLast(i);;
        }
        myLinkedList.display();
        System.out.println( myLinkedList.contains(3));
        System.out.println(myLinkedList.size());
        myLinkedList.addIndex(10,10);
        myLinkedList.remove(9);
        myLinkedList.addFirst(0);
        myLinkedList.addFirst(0);
        myLinkedList.addFirst(0);
        myLinkedList.addFirst(0);
        myLinkedList.addIndex(8,0);
        myLinkedList.addIndex(8,0);
        myLinkedList.addIndex(8,0);
        myLinkedList.addIndex(8,0);
        myLinkedList.addLast(0);
        myLinkedList.addLast(0);
        myLinkedList.addLast(0);
        myLinkedList.addLast(0);
        myLinkedList.addLast(0);
        myLinkedList.removeAllkey(0);
        myLinkedList.display();
       // myLinkedList.clear();
        System.out.println("12345");

    }
}