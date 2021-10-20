package list;

public class LinkedList {
    ListNode first = null;
    ListNode last = null;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.build(new int[]{1, 2, 3});
        System.out.println(linkedList.getFirst().val);
        System.out.println(linkedList.getLast().val);
    }

    public void build(int[] nums) {
        if (nums.length == 0) return;

        ListNode dummy = new ListNode(-1);
        ListNode ref = dummy;

        for (int num : nums) {
            ref.next = new ListNode(num);
            ref = ref.next;
        }

        this.last = ref;
        this.first = dummy.next;
    }

    public ListNode getFirst() {
        return first;
    }

    public ListNode getLast() {
        return last;
    }

    public void traverse() {
        while (first != null) {
            System.out.print(first.val + " ");
        }

        System.out.println();
    }
}
