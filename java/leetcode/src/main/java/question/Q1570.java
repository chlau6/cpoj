package question;

import java.util.HashMap;
import java.util.Map;

public class Q1570 {
    class SparseVector {
        public Map<Integer, Integer> map = new HashMap<>();

        SparseVector(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    map.put(i, nums[i]);
                }
            }
        }

        public int dotProduct(SparseVector vec) {
            int dotProduct = 0;

            for (int key : map.keySet()) {
                if (vec.map.containsKey(key)) {
                    dotProduct += map.get(key) * vec.map.get(key);
                }
            }

            return dotProduct;
        }
    }

}

/*
1570. Dot Product of Two Sparse Vector
 */
