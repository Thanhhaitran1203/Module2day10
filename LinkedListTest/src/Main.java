public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        linkedList.addFirst(14);
        linkedList.printList();
        linkedList.add(5,9);
        linkedList.addFirst(15);
        linkedList.printList();
    }
}