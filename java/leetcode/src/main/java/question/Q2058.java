package question;

import datastructure.ListNode;

public class Q2058 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = new int[]{-1, -1};

        ListNode prev = null;
        int count = 0;
        int last = -1;
        int first = -1;
        int min = Integer.MAX_VALUE;

        while (head != null) {
            count++;

            if (prev == null) {
                prev = head;
                head = head.next;
                continue;
            }

            if (head.next == null) {
                break;
            }

            if (prev.val < head.val && head.val > head.next.val || prev.val > head.val && head.val < head.next.val) {
                if (first == -1) {
                    first = count;
                }

                if (last == -1) {
                    last = count;
                } else {
                    min = Math.min(min, count - last);
                    last = count;
                }
            }

            prev = head;
            head = head.next;
        }

        result[0] = min == Integer.MAX_VALUE ? -1 : min;
        result[1] = last == first ? -1 : last - first;

        return result;
    }
}
/*
2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
 */
