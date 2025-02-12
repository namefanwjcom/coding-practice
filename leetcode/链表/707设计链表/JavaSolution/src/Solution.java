class MyLinkedList {

    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    ListNode head;
    int length;

    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public int get(int index) {
        ListNode curr = this.head;
        for (int i = 0; i < index && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return -1;
        } else {
            return curr.val;
        }
    }

    public void addAtHead(int val) {
        this.head = new ListNode(val, this.head);
        this.length++;
    }

    public void addAtTail(int val) {
        if (this.head == null) {
            this.head = new ListNode(val, null);
            this.length++;
            return;
        }
        ListNode curr = this.head;
        for (; curr.next != null; curr = curr.next) {}
        curr.next = new ListNode(val, null);
        this.length++;
    }

    public void addAtIndex(int index, int val) {
        if (index > this.length) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        ListNode curr = this.head;
        for (int i = 0; i < index - 1; i++) {curr = curr.next;}
        curr.next = new ListNode(val, curr.next);
        this.length++;
    }

    public void deleteAtIndex(int index) {
        if (index >= this.length) return;
        if (index == 0) {
            head = head.next;
            this.length--;
            return;
        }
        ListNode curr = head;
        for (int i = 0; i < index - 1; i++) {curr = curr.next;}
        curr.next = curr.next.next;
        this.length--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */