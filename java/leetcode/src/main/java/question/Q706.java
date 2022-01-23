package question;

import java.util.Arrays;

public class Q706 {
    class MyHashMap {
        int[] hashMap = new int[1000001];

        public MyHashMap() {
            Arrays.fill(hashMap, -1);
        }

        public void put(int key, int value) {
            hashMap[key] = value;
        }

        public int get(int key) {
            return hashMap[key];
        }

        public void remove(int key) {
            hashMap[key] = -1;
        }
    }
}

/*
704. Binary Search
 */
