package question;

import java.util.*;

public class Q658 {
    /*
    Two Pointers
     */
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;

        while (right - left >= k) {
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;
            } else {
                right--;
            }
        }

        for (int i = left; i <= right; i++) {
            result.add(arr[i]);
        }

        return result;
    }

    /*
    Queue
     */
    public List<Integer> findClosestElements2(int[] arr, int k, int x) {
        Queue<Integer> queue = new LinkedList<>();

        for (int num : arr) {
            if (queue.size() < k) {
                queue.offer(num);
            } else if (Math.abs(num - x) < Math.abs(queue.element() - x)) {
                queue.poll();
                queue.offer(num);
            }
        }

        return new ArrayList<>(queue);
    }

    /*
    Heap
     */
    public List<Integer> findClosestElements3(int[] arr, int k, int x) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        for (int num : arr) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(num);
            } else if (Math.abs(num - x) < Math.abs(priorityQueue.element() - x)) {
                priorityQueue.poll();
                priorityQueue.offer(num);
            }
        }

        List<Integer> ans = new ArrayList<>();
        int size = priorityQueue.size();
        for (int i = 0; i < size; i++) {
            ans.add(priorityQueue.remove());
        }

        return ans;
    }
}

/*
658. Find K Closest Elements
 */
