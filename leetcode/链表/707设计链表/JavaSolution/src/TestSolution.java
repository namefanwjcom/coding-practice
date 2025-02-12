public class TestSolution {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        System.out.println(obj.head.val + " " + obj.length + " " + obj.head.next);
        obj.deleteAtIndex(0);
    }
}
