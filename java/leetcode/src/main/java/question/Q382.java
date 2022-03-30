package question;

import datastructure.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Q382 {
    class Solution {
        List<ListNode> list = new ArrayList<>();
        Random random = new Random();

        public Solution(ListNode head) {
            while (head != null) {
                list.add(head);
                head = head.next;
            }
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size())).val;
        }
    }

    /*
    Reservoir Sampling
     */
    class Solution2 {
        ListNode head;
        Random random = new Random();

        public Solution2(ListNode head) {
            this.head = head;
        }

        public int getRandom() {
            ListNode temp = this.head;
            int i = 1;
            int result = 0;

            while (temp != null) {
                if (random.nextDouble() * i < 1) {
                    result = temp.val;
                }

                temp = temp.next;
                i++;
            }

            return result;
        }
    }
}

/*
382. Linked List Random Node
 */
