package question;

import annotation.*;

@Array
@HashTable
@LinkedLists
@Design
@HashFunction
public class Q705 {
    /*
    add:        Time Complexity: O(1)   Space Complexity: O(1)
    remove:     Time Complexity: O(1)   Space Complexity: O(1)
    contains:   Time Complexity: O(1)   Space Complexity: O(1)
     */
    class MyHashSet {
        boolean[] hashSet = new boolean[1000001];

        public MyHashSet() {

        }

        public void add(int key) {
            hashSet[key] = true;
        }

        public void remove(int key) {
            hashSet[key] = false;
        }

        public boolean contains(int key) {
            return hashSet[key];
        }
    }
}

/*
704. Binary Search
 */
