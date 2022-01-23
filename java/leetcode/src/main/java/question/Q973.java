package question;

import java.util.*;

public class Q973 {
    /*
    QuickSelect
     */
    public int[][] kClosest(int[][] points, int k) {
        int left = 0;
        int right = points.length - 1;

        while (left < right) {
            int mid = partition(left, right, points);
            if (mid == k) {
                break;
            } else if (mid < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return Arrays.copyOfRange(points, 0, k);
    }

    private int partition(int left, int right, int[][] points) {
        int pivotDistance = distance(points[right]);
        int swapIndex = left - 1;

        for (int i = left; i < right; i++) {
            if (distance(points[i]) < pivotDistance) {
                swap(points, ++swapIndex, i);
            }
        }

        swap(points, ++swapIndex, right);

        return swapIndex;
    }

    private int distance(int[] p1) {
        return p1[0] * p1[0] + p1[1] * p1[1];
    }

    private void swap(int[][] points, int i, int j) {
        int[] temp = points[i];
        points[i] = points[j];
        points[j] = temp;
    }

    /*
    Heap
     */
    public int[][] kClosest2(int[][] points, int k) {
        Queue<int[]> queue = new PriorityQueue<>(Collections.reverseOrder(Comparator.comparingInt(a -> a[0] * a[0] + a[1] * a[1])));

        for (int[] point : points) {
            queue.add(point);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int[][] ans = new int[k][2];

        while (k > 0) {
            ans[k--] = queue.poll();
        }

        return ans;
    }

    /*
    Array
     */
    public int[][] kClosest3(int[][] points, int k) {
        Arrays.sort(points, Comparator.comparing(a -> a[0] * a[0] + a[1] * a[1]));
        return Arrays.copyOfRange(points, 0, k);
    }
}
