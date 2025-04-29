// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head) {
        // Dummy node to ease edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swapping
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move current two nodes ahead
            current = first;
        }

        return dummy.next;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.print("Original List: ");
        printList(head);
        ListNode swapped = swapPairs(head);
        System.out.print("Swapped List: ");
        printList(swapped);
    }
}
