class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to simplify edge cases (like removing the head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // First and second pointers both start at dummy
        ListNode first = dummy;
        ListNode second = dummy;

        // Advance first pointer n+1 steps to maintain a gap
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the target node
        second.next = second.next.next;

        return dummy.next;
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        ListNode head1 = createList(input1);
        head1 = removeNthFromEnd(head1, 2);
        printList(head1);  // Output: 1 -> 2 -> 3 -> 5

        int[] input2 = {1};
        ListNode head2 = createList(input2);
        head2 = removeNthFromEnd(head2, 1);
        printList(head2);  // Output: (empty)

        int[] input3 = {1, 2};
        ListNode head3 = createList(input3);
        head3 = removeNthFromEnd(head3, 1);
        printList(head3);  // Output: 1
    }
}
